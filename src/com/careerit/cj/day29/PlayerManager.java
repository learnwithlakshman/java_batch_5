package com.careerit.cj.day29;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

	public static void main(String[] args) {
		List<Player> playerList = CsvReaderUtil.loadFromFile();
		double maximumAmount = maxAmount(playerList);
		System.out.println("Maximum amount paid is :" + maximumAmount);
		double minimumAmount = minAmount(playerList);
		System.out.println("Minimum amount paid is :" + minimumAmount);
		List<Player> maxPaidPlayerList = maxPaidPlayers(playerList);
		System.out.println("Max amount is :" + maximumAmount + " and max amount is paid to " + maxPaidPlayerList.size()
				+ " players ");
		System.out.println("----------------- Max paid player(s)-------------------------- ");
		showPlayerDetails(maxPaidPlayerList);

		List<Player> minPaidPlayerList = minPaidPlayers(playerList);
		System.out.println("Min amount is :" + maximumAmount + " and min amount is paid to " + minPaidPlayerList.size()
				+ " players ");
		System.out.println("----------------- Minimum amount paid player(s)-------------------------- ");
		showPlayerDetails(minPaidPlayerList);
	}

	public static double maxAmount(List<Player> players) {
		double max = players.get(0).getPrice();
		for (Player player : players) {
			if (max < player.getPrice()) {
				max = player.getPrice();
			}
		}
		return max;
	}

	public static double minAmount(List<Player> players) {
		double min = players.get(0).getPrice();
		for (Player player : players) {
			if (min > player.getPrice()) {
				min = player.getPrice();
			}
		}
		return min;
	}

	public static List<Player> maxPaidPlayers(List<Player> players) {
		double max = maxAmount(players);
		List<Player> list = new ArrayList<>();
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			if (player.getPrice() == max) {
				list.add(player);
			}
		}
		return list;
	}

	public static List<Player> minPaidPlayers(List<Player> players) {
		double min = minAmount(players);
		List<Player> list = new ArrayList<>();
		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			if (player.getPrice() == min) {
				list.add(player);
			}
		}
		return list;
	}

	public static double totalAmountSpentByAllTeams(List<Player> players) {
		return 0.0d;
	}

	public static double totalAmountSpentByRole(String role) {
		return 0.0d;
	}

	public static long playerCuontByRole(String role) {
		return 0;
	}

	public static List<Player> getPlayerByRole(String role) {
		return null;
	}
	
	public static double averageAmountPaidForPlayer(List<Player> players) {
		return 0;
	}

	public static void showPlayerDetails(List<Player> players) {
		for (Player player : players) {
			System.out.println(String.format("Player [name=%s, role=%s, price=%s]", player.getName(), player.getRole(),
					player.getPrice()));
		}
	}
}
