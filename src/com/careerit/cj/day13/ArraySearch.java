package com.careerit.cj.day13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySearch {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 50);
		}
		System.out.println("Guess a  number 1-50 to win prize");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (search(arr, input)) {
			System.out.println("You won.... prize");
		} else {
			System.out.println("Sorry!.... try again : "+Arrays.toString(arr));
		}
		sc.close();

	}

	private static boolean search(int[] arr, int ele) {

		if (arr.length == 0 || arr == null) {
			return false;
		}

		for (int i : arr) {
			if (i == ele) {
				return true;
			}
		}
		return false;
	}
}
