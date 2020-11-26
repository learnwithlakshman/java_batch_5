package com.careerit.cj.day15;

public class CheckPalindrome {

		public static void main(String[] args) {
			
					String name = "LIRRIL";
					boolean flag = true;
//					for(int i=0,j=name.length()-1;i<=j;i++,j--) {
//						if(name.charAt(i) != name.charAt(j)) {
//							flag = false;
//							break;
//						}
//					}
					
					StringBuilder sb1 = new StringBuilder("1234");
					StringBuilder sb2 = new StringBuilder("1234");
					
					System.out.println(sb1 == sb2);
					System.out.println(sb1.equals(sb2));
					
					String s1 = sb1.toString();
					String s2 = sb2.toString();
					System.out.println(s1.equals(s2));
					
					
					
					flag = new StringBuilder(name).reverse().toString().equals(name);
					
					if(flag) {
						System.out.println(name +" is palindrome");
					}else {
						System.out.println(name+" is not palindrome");
					}
		}
}
