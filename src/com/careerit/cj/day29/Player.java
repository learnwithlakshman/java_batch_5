package com.careerit.cj.day29;

public class Player {

		private String name;
		private String role;
		private double price;
		
		public Player() {
			super();
		}
		
		public Player(String name, String role, double price) {
			super();
			this.name = name;
			this.role = role;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return String.format("Player [name=%s, role=%s, price=%s]", name, role, price);
		}

		
		
		
}
