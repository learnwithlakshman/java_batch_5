package com.careerit.cj.day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOperations {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1001);
		System.out.println(list.size());
		list.add(1002);
		System.out.println(list.size());
		list.add(1003);
		System.out.println(list);

		list.remove(Integer.valueOf(1002));
		System.out.println(list);
		System.out.println(list.isEmpty());

		list.addAll(List.of(1004, 1005));
		System.out.println(list);
		list.set(0, 1111);
		System.out.println(list);
		list.add(1, 1112);
		System.out.println(list);

		System.out.println("----------------- using for loop ---------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------- using for each ----------------------");
		for (Integer ele : list) {
			System.out.println(ele);
		}

		System.out.println("----------------- Using Iterator ----------------------");

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer ele = itr.next();
			if (ele == 1003) {
				itr.remove();
			}
		}
		System.out.println(list);

		System.out.println("----------------- Using ListIterator -------------------");

		ListIterator<Integer> listItr = list.listIterator();

		while (listItr.hasNext()) {
			Integer ele = listItr.next();
			System.out.println(ele);
		}
		System.out.println("..............Backward direction --------------");
		while (listItr.hasPrevious()) {
			Integer ele = listItr.previous();
			System.out.println(ele);
		}

		System.out.println("-------------------- Using streams --------------------");
		// list.stream().forEach((ele)->System.out.println(ele));

		list.stream().forEach(System.out::println);

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1001);
		numbers.add(1009);
		numbers.add(1003);
		numbers.add(1004);
		numbers.add(1006);
		numbers.add(1008);
		numbers.add(1002);
		numbers.add(1005);
		System.out.println(numbers);
	
		numbers.sort(Comparator.reverseOrder());
	
		System.out.println(numbers);
	}

}
