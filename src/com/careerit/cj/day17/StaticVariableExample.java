package com.careerit.cj.day17;

class Product {

	private int pid;
	private String pname;
	private double price;
	private static int count;

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		count++;
	}

	public void discount(double percentage) {
		this.price = this.price - (this.price * percentage / 100);
	}

	public static int getCount() {
		return count;
	}

	public void showInfo() {
		System.out.println(String.format("Product [pid : %d, pname %s and price : %f ]", pid, pname, price));
	}

}

public class StaticVariableExample {

	public static void main(String[] args) {
		System.out.println(Product.getCount());
		
		Product product1 = new Product(1, "Abc", 8877);
		Product product2 = new Product(1001,"Dell",12345);
		Product product3 = new Product(1003, "Hello", 8766);
		
	}
}










