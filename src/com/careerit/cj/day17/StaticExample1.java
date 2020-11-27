package com.careerit.cj.day17;

class HomePage{
	
		private static int count = 0;
		public HomePage() {
			System.out.println("new user visited with count :"+ ++count);
		}
		
		public static int getCount() {
			return count;
		}
		
}

public class StaticExample1 {

		public static void main(String[] args) {
			HomePage obj1 = new HomePage();
			HomePage obj2 = new HomePage();
			HomePage obj3 = new HomePage();
			HomePage obj4 = new HomePage();
	
			
			System.out.println(HomePage.getCount());
			System.out.println(obj1.getCount());
			System.out.println(obj3.getCount());
			
		}
}
