package com.careerit.cj.day12;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {

	public static void main(String[] args) {
		// Generate 5 random integers then find the sum and average

		/*
		 * int num1 = ThreadLocalRandom.current().nextInt(10, 31); int num2 =
		 * ThreadLocalRandom.current().nextInt(10, 31); int num3 =
		 * ThreadLocalRandom.current().nextInt(10, 31); int num4 =
		 * ThreadLocalRandom.current().nextInt(10, 31); int num5 =
		 * ThreadLocalRandom.current().nextInt(10, 31);
		 * 
		 * int sum = num1 + num2 + num3 + num4 + num5; float average = sum / 5.0f;
		 * System.out.printf("The sum of [%d, %d, %d, %d, %d] : %d and average is : %f",
		 * num1, num2, num3, num4, num5, sum, average);
		 */

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(10, 31);
		}
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		float average = sum / (float) arr.length;
		System.out.printf("Sum of %s is %d and average is %f ", Arrays.toString(arr), sum, average);
		
		
	}

	
}
