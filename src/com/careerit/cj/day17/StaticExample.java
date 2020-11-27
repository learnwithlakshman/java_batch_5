package com.careerit.cj.day17;


public class StaticExample {
		static int i = 10;
		static int num = 10;
		
		public StaticExample() {
			i++;
		}
		static {
			num++;
			System.out.println("B - "+num);
		    
		}
		
		public static void main(String[] args) {
			System.out.println(num);
			StaticExample obj1 = new StaticExample();
			System.out.println(StaticExample.num);
			
			System.out.println(obj1.i);
			StaticExample obj2 = new StaticExample();
			
			StaticExample obj3 = new StaticExample();
			System.out.println(obj2.i);
			System.out.println(obj3.i);
			System.out.println(StaticExample.i);
		}
}
