package com.careerit.cj.day7;

import java.util.Scanner;

public class MatrixPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value:");
		int n = sc.nextInt();
		System.out.println("Enter the M value :");
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		sc.close();

	}
}
