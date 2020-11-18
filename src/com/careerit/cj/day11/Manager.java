package com.careerit.cj.day11;

public class Manager {

		public static void main(String[] args) {
			
				Product obj1 = new Product(1001, "Lenovo ThinkPad", 65000);
				Product obj2 = new Product(1001, "Lenovo ThinkPad", 65001);
				
				System.out.println(obj1);
				System.out.println(obj2);
				
				System.out.println(obj1 == obj2);
				System.out.println(obj1.equals(obj2));
				
		}
}
