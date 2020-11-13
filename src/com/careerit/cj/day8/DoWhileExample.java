package com.careerit.cj.day8;

public class DoWhileExample {

		public static void main(String[] args) {
			
				int i = 1;
				int num = 15;
				do {
					System.out.println(num + " * "+i+" = "+(num * i));
					i++;
				}while(i <= 10);
		}
}
