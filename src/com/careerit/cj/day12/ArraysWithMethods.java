package com.careerit.cj.day12;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysWithMethods {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		// Forward
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// Reverse
		System.out.println("--------------------");

//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}

		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = ThreadLocalRandom.current().nextInt(1, 101);
		}

		System.out.println("Max value of : " + Arrays.toString(numArr) + " is " + maxElement(numArr));
		System.out.println("Min value of : " + Arrays.toString(numArr) + " is " + minElement(numArr));
		System.out.println("Sum of       : " + Arrays.toString(numArr) + " is " + sumOfElements(numArr));
		System.out.println(isPalindrome(new int[] {1,2,1}));
		System.out.println(isPalindrome(new int[] {1,2,2}));
		System.out.println(isPalindrome(new int[] {1,2,2,1}));
	}

	private static int maxElement(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	private static int minElement(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int sumOfElements(int[] arr) {
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		return sum;
	}

	private static boolean isPalindrome(int[] arr) {
		for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}

}
