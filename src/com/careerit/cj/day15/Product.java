package com.careerit.cj.day15;

public class Product {

		private int pid;
		private String name;
		private String brand;
		private double price;
		private String description;
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Product [pid=").append(pid).append(", name=").append(name).append(", brand=").append(brand)
					.append(", price=").append(price).append(", description=").append(description).append("]");
			return builder.toString();
		}
		
		
		
		
		
		
}
