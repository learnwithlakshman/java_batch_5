package com.careerit.cj.day12;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExampleWithInit {

	public static void main(String[] args) {

		int[] arr1 = getRandomEvenNumbers();
		int[] arr2 = getRandomOddNumbers();

		int[] arr3 = new int[arr1.length + arr2.length];

		/*
		 * int c = 0; for(int ele:arr1) { arr3[c++] = ele; }
		 * 
		 * for(int ele:arr2) { arr3[c++] = ele; }
		 */
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static int[] getRandomOddNumbers() {
		int[] oddArr = new int[ThreadLocalRandom.current().nextInt(10, 21)];
		int count = 0;
		for (;;) {
			int num = ThreadLocalRandom.current().nextInt(1, 101);
			if (num % 2 != 0) {
				oddArr[count++] = num;
			}
			if (count == oddArr.length) {
				break;
			}
		}
		return oddArr;
	}

	private static int[] getRandomEvenNumbers() {
		int[] evenArr = new int[ThreadLocalRandom.current().nextInt(10, 21)];
		int count = 0;
		for (;;) {
			int num = ThreadLocalRandom.current().nextInt(1, 101);
			if (num % 2 == 0) {
				evenArr[count++] = num;
			}
			if (count == evenArr.length) {
				break;
			}
		}
		return evenArr;
	}
}
