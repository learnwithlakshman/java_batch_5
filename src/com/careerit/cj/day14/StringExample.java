package com.careerit.cj.day14;

public class StringExample {

	public static void main(String[] args) {
		String name1 = "Core";
		String name2 = "Core";
		String name3 = new String("Core");
		String name4 = new String("Core");

		System.out.println(name1 == name2);
		System.out.println(name3 == name4);

		System.out.println(name1.equals(name4));
		System.out.println(name3.equals(name4));

		name1 = name1.concat(" Java"); // new operator
		String name5 = "Core Java";
		System.out.println(name1 == name5);
		System.out.println(name1.equals(name5));

		String s1 = "Hello";
		String s2 = "Hell".concat("o");
		System.out.println(s1 == s2);

		System.out.println(isExistingUser("LAKSHMAN"));
		System.out.println(isExistingUser("  Chandu"));
		System.out.println(isExistingUser("  sravanthi "));
		System.out.println(isExistingUser("  MouNika   "));
		System.out.println(isExistingUser("Sai"));
		
		String data = "Krish,Manoj,Charan,Ramesh,Rajesh,Sai Krishna, Sai Rama";
		// First 3 characters -> upper case
		String[] arr = data.split(",");
		
					
		for(String name : arr) {
			System.out.println(name.substring(0, 4).trim().toUpperCase().substring(2).toLowerCase());
		}
		
	}
	
	

	private static boolean isExistingUser(String username) {
		String[] users = { "Krish", "Manoj", "Charan", "Ramesh", "Rajesh", "Chandu", "Mounika", "Ranjan", "Sravanthi",
				"Lakshman" };
		
		for (String user : users) {
			if (user.toLowerCase().equals(username.trim().toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
