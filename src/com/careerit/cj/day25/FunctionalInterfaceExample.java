package com.careerit.cj.day25;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


// Maker interface


@FunctionalInterface
interface MyPredicate extends Serializable, Cloneable {
	boolean test(int num);
}

interface MathOperation {
	int perform(int a, int b);
}

public class FunctionalInterfaceExample {

	public int count(int[] arr, MyPredicate predicate) {
		int count = 0;
		for (int ele : arr) {
			if (predicate.test(ele)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Predicate<Integer> predicate = (num) -> num % 5 == 0 && num % 2 != 0;
		Consumer<String> consumer = (num) -> System.out.println(num);
		Function<String, Integer> function = (name) -> name.length();
		
		
		int[] numArr = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
		int eCount = obj.count(numArr, (num) -> num % 2 == 0);
		int oCount = obj.count(numArr, (num) -> num % 2 != 0);
		int dCount = obj.count(numArr, (num) -> num % 5 == 0);
		System.out.println("Even numbers count :" + eCount);
		System.out.println("Even numbers count :" + oCount);
		System.out.println("Even numbers count :" + dCount);

	}

}

// If interface has only one abstract method is called functional interface