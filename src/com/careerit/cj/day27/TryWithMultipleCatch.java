package com.careerit.cj.day27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithMultipleCatch {

	public static void main(String[] args) {

		
		String name = "";
		try (Scanner sc = new Scanner(new File("names.txt"))) {
			

			while (sc.hasNextLine()) {
				try {
					name = sc.nextLine();
					System.out.println(name.substring(0, 4).toUpperCase());
					
				} catch (StringIndexOutOfBoundsException e) {
					try {
						String message = "While reading name :" + e + " reason is :" + name + " has length: "
								+ name.length();
						FileWriter fw = new FileWriter("abc.log");
						fw.write(message);
						fw.close();
					} catch (IOException ex) {
						System.out.println("While wirting exception into file :" + ex);
					}
				}
			}
			
		}
		
		catch (IOException e) {
			System.out.println("While processing names from file :" + e);
		}
		// Other logic
		System.out.println("End of main method");
	}
}
