package com.careerit.cj.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringBuilderExample {

			// Read names from file "and" convert names into csv format
	
			public static void main(String[] args) throws FileNotFoundException {
				

			         StringBuffer sb = new StringBuffer();
					 Scanner sc = new Scanner(new File("names.txt"));
					 while(sc.hasNextLine()) {
						String name = sc.nextLine();
						//data = data.concat(name).concat(",");
						sb.append("\""+name+"\"").append(",");
					}
					
					String data = sb.substring(0, sb.length()-1);
					System.out.println(data);
			}
}
