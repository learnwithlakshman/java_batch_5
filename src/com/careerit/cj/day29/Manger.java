package com.careerit.cj.day29;

import java.util.ArrayList;
import java.util.List;

public class Manger {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // Generics introduced in 1.5

		list.add("Manoj");
		list.add("Krish");
		list.add("Charan");
		list.add("Manoj");
		System.out.println(list);
		System.out.println(list.size());
		list.add("Balu");
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		// Get all elements from the list and display in upper case 
		System.out.println("----------------------- using for loop ---------------------------------");
		for(int i=0;i<list.size();i++) {
			String ele = list.get(i);
			System.out.println(ele.toUpperCase());
		}
		
		System.out.println("---------------------- using for loop - reverse order -------------------");
		
		for(int i=list.size()-1;i>=0;i--) {
			String ele = list.get(i);
			System.out.println(ele.toUpperCase());
		}
		
		System.out.println("---------------------- using for each -----------------------------------");
		
		for(String ele:list) {
			System.out.println(ele.toUpperCase());
		}
		
	}
}
