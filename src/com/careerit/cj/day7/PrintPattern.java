package com.careerit.cj.day7;

public class PrintPattern {

		public static void main(String[] args) {
			
				for(int i=1;i<=5;i++) {
					for(int j=5;j>i;j--) {
						System.out.print(" ");
					}
					int k=1;
					for(k=1;k<=i;k++) {
						System.out.print(k);
					}
					for(int l=k-2;l>=1;l--) {
						System.out.print(l);
					}
					System.out.println();
				}
				
		}
}
