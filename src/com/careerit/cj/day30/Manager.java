package com.careerit.cj.day30;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Manager {

	public static void main(String[] args) {

		List<Player> players = CsvReaderUtil.loadFromFile();

		// Can you get names of the all players

//				List<String> namesList = new ArrayList<>();
//				
//				for(Player player:players) {
//					namesList.add(player.getName());
//				}

		List<String> namesList = players.stream().map(player -> player.getName()).collect(Collectors.toList());

		namesList.stream().forEach(System.out::println);

		// Get me the all the players into another list who were paid 2000000

//		List<Player> playerWith20L = new ArrayList<>();
//
//		for (Player player : players) {
//				if(player.getPrice() == 2000000) {
//					playerWith20L.add(player);
//				}
//		}

		List<Player> playerWith20L = players.stream().filter((player) -> player.getPrice() == 2000000)
				.collect(Collectors.toList());

		playerWith20L.stream().forEach(ele -> System.out.println(ele));

		// Can you get player name who are getting more than 100000000

//		List<String> namesOfPlayerMore10Cr = new ArrayList<>();
//		
//		for(Player player:players) {
//				if(player.getPrice() > 12_00_00_000) {
//					namesOfPlayerMore10Cr.add(player.getName());
//				}
//		}
		List<String> namesOfPlayerMore10Cr = players.stream().filter(player -> player.getPrice() > 12_00_00_000)
				.map(player -> player.getName()).collect(Collectors.toList());

		System.out.println(namesOfPlayerMore10Cr);

		// Can you get player name and role of each player who are getting more
		// 12_00_00_000

//		List<PlayerDTO> playerWithRolePaidGt20Cr = new ArrayList<>();
//		for(Player player:players) {
//			if(player.getPrice() > 12_00_00_000) {
//				PlayerDTO obj = new PlayerDTO(player.getName(),player.getRole());
//				playerWithRolePaidGt20Cr.add(obj);
//			}
//		}
		
		List<PlayerDTO> playerWithRolePaidGt20Cr = 
				players.stream()
				.filter(p -> p.getPrice() > 12_00_00_000)
				.map(ele -> new PlayerDTO(ele.getName(), ele.getRole()))
				.collect(Collectors.toList());
		System.out.println(playerWithRolePaidGt20Cr);
		
		
		// Can you get player names who are getting more 10Cr and role is Batsman
		
//		List<String> playerNameWith10CrAndBatsman = new ArrayList<>();
//		for(int i=0;i<players.size();i++) {
//			Player player = players.get(i);
//			if(player.getPrice() > 10_00_00_000 && player.getRole().equals("Batsman")) {
//				playerNameWith10CrAndBatsman.add(player.getName());
//			}
//		}
		
		Predicate<Player> predicate = (player)->player.getPrice() > 10_00_00_000 && player.getRole().equals("Batsman");
		List<String> playerNameWith10CrAndBatsman = players.stream().filter(predicate).map(p->p.getName()).collect(Collectors.toList());
		System.out.println(playerNameWith10CrAndBatsman);
		
		
	}

}
