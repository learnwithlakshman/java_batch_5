package com.careerit.cj.day29;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListMethodExamples {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			list.add(ThreadLocalRandom.current().nextInt(1, 100));
		}

		// Can you get all odd number into another list
		// Can you get all even number into another list

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int ele = list.get(i);
			if (ele % 2 == 0) {
				evenList.add(ele);
			} else {
				oddList.add(ele);
			}
		}

		System.out.println(list);
		System.out.println(evenList);
		System.out.println(oddList);
		
		
		List<String> gnames = List.of("Tanvi", "Dhatri", "Haadya");
		List<String> bnames = List.of("Lakshman", "Sai", "Nareen");
		
		List<String> names = new ArrayList<>();
		names.addAll(gnames);
		names.addAll(bnames);
		System.out.println(names);
		
		
		// display the names which starts with  or ends with letter 'N'
		
		for(String name:names) {
			if(name.toLowerCase().startsWith("n") || name.toLowerCase().endsWith("n")) {
				System.out.println(name);
			}
		}
		
		// Display the names, which are having length as > 3 characters
		System.out.println("---------------------- name with more than 3 characters ----------------");
		for(String name:names) {
			if(name.length() > 3) {
				System.out.println(name);
			}
		}
		
		

	}
}
