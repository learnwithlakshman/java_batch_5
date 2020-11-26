package com.careerit.cj.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductManager {

		public static void main(String[] args) throws FileNotFoundException {
			
				// Read data from products.txt while displaying data use "-" as separator 
			
			
			// 1-lenovo-3500,2-dell-45000
			
			//StringBuffer
			 StringBuilder sb = new StringBuilder();
			 Scanner sc = new Scanner(new File("products.txt"));
			 while(sc.hasNextLine()) {
				String line = sc.nextLine();
				line = line.replace(",", "-");
				sb.append(line).append(",");
			}
			 
			String data = sb.substring(0,sb.length()-1);
			System.out.println(data);
		}
}
