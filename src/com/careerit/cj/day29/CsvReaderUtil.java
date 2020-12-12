package com.careerit.cj.day29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class CsvReaderUtil {

	private CsvReaderUtil() {

	}

	public static List<Player> loadFromFile() {

		List<Player> players = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new File("players.csv"));

			sc.nextLine(); // skip first row
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] data = line.split(",");
				String name = data[0];
				double price = Double.parseDouble(data[1]);
				String role = data[2];

				Player player = new Player(name, role, price);
				players.add(player);
			}

		} catch (FileNotFoundException e) {
			System.out.println("While reading the file :" + e);
		}
		return players;
	}
}
