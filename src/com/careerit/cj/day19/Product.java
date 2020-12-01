package com.careerit.cj.day19;

public class Product {

	private int pid;
	private String name;
	private double price;

	public Product(String name, double price) {
		this.pid = IdGenerator.newId();
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
