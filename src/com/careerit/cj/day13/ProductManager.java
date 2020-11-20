package com.careerit.cj.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductManager {

	public static void main(String[] args) throws FileNotFoundException {

		Product[] arr = new Product[8];
		Scanner sc = new Scanner(new File("products.txt"));
		int i = 0;
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] dataArr = data.split(",");

			int pid = Integer.parseInt(dataArr[0]);
			String name = dataArr[1].trim();
			double price = Double.parseDouble(dataArr[2]);

			Product product = new Product(pid, name, price);
			arr[i++] = product;

		}
		// Display only product name and price

		for (Product product : arr) {
			System.out.println(product.getName() + "     " + product.getPrice());

		}

		// Max priced product
		
		double maxPrice = maxPrice(arr);
		productPriceEq(arr, maxPrice);
		
		// Min priced product
		double minPrice = minPrice(arr);
		productPriceEq(arr, minPrice);
		// Product which are < 50000
		productPriceLt(arr, 40000);
	}

	private static double maxPrice(Product[] arr) {
		double max = arr[0].getPrice();
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i].getPrice()) {
				max = arr[i].getPrice();
			}
		}
		return max;
	}
	
	private static double minPrice(Product[] arr) {
		double min = arr[0].getPrice();
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i].getPrice()) {
				min = arr[i].getPrice();
			}
		}
		return min;
	}

	private static void productPriceLt(Product[] arr, double price) {
		System.out.println("----------------------- Products below " + price + " --------------------");
		for (Product product : arr) {
			if (product.getPrice() < price) {
				System.out.println(product);
			}
		}
	}

	private static void productPriceEq(Product[] arr, double price) {
		System.out.println("----------------------- Product with price :( " + price + ") --------------------");
		for (Product product : arr) {
			if (product.getPrice() == price) {
				System.out.println(product);
			}
		}
	}
}
