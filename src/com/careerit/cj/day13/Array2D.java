package com.careerit.cj.day13;

public class Array2D {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for(int eleArr[]:arr) {
			for(int ele:eleArr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
}
