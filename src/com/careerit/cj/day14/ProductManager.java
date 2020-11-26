package com.careerit.cj.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductManager {

		public static void main(String[] args) throws FileNotFoundException {
			
			
					Scanner sc = new Scanner(new File("products.txt"));
					Product[] products = new Product[8];
					int i = 0;
					while(sc.hasNext()) {
					
						String line = sc.nextLine();
						String[] arr = line.split(",");
						int pid = Integer.parseInt(arr[0]);  
						String pname = arr[1];
						double price = Double.parseDouble(arr[2]);
						
						products[i++] = new Product(pid, pname, price);
						
					}
					
				    for(Product product:products) {
						product.showInfo();
					}
					 
					
		}
}
