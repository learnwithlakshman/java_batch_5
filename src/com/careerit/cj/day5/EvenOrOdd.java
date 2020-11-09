package com.careerit.cj.day5;

import java.util.Scanner;

public class EvenOrOdd {

          public static void main(String... args){
        	  	
        	  		Scanner sc = new Scanner(System.in);
         	  		System.out.println("Enter integer value to check even or odd");
        	  		int num = sc.nextInt();
        	  		// To check even or odd
        	  		if(num % 2 == 0) {   
        	  			System.out.println("Even");
        	  		}else {
        	  			System.out.println("Odd");
        	  		}
        	  		sc.close();
          }
}
