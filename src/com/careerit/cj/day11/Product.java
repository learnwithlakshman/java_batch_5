package com.careerit.cj.day11;

import java.util.Objects;

public class Product{

		private int pid;
		private String name;
		private double price;
		
		public Product(int pid, String name, double price) {
			this.pid = pid;
			this.name = name;
			this.price = price;
		}
		
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
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, pid);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return Objects.equals(name, other.name) && pid == other.pid;
		}


		
		

		
		
}
