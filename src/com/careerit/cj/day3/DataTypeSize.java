package com.careerit.cj.day3;

public class DataTypeSize {
		static byte byte_val;
		static short short_val;
		static int int_val;
		static char char_val;
		static float float_val;
		static double double_val;
		static long long_val;
		static boolean bool_val;
		
		int res;
		static String name;
		
		public static void main(String[] args) {
			int num=0;
			
			System.out.println("Byte  :"+Byte.MIN_VALUE +" - "+ Byte.MAX_VALUE + " Default value :"+byte_val);
			System.out.println("Short :"+Short.MIN_VALUE +" - "+ Short.MAX_VALUE + " Default value :"+short_val);
			System.out.println("char : "+Character.MIN_VALUE +" - "+ Character.MAX_VALUE + " Default value :"+char_val);
			System.out.println("int  : "+Integer.MIN_VALUE +" - "+ Integer.MAX_VALUE + " Default value :"+int_val);
			System.out.println("float : "+Float.MIN_VALUE +" - "+ Float.MAX_VALUE + " Default value :"+float_val);
			System.out.println("double :"+Double.MIN_VALUE +" - "+ Double.MAX_VALUE + " Default value :"+double_val);
			System.out.println("long  :"+Long.MIN_VALUE +" - "+ Long.MAX_VALUE + " Default value :"+long_val);
			System.out.println("boolean"+" Default value :"+bool_val);
			System.out.println(name);
			System.out.println(num);
			
		}
		
		
		public static int factorial(int num) {
				int res = 1;
				for(int i=2;i<=num;i++) {
					res *= i;
		      	}
				return res;
		}
}
