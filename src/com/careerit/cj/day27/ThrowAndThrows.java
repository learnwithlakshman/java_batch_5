package com.careerit.cj.day27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


enum Operator{
	PLUS,MINUS,MUL,DIV,MOD
}

class MyMath {

	public List<String> readNamesFromFile(File file) throws FileNotFoundException {
		List<String> namesList = new ArrayList<>();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			namesList.add(sc.nextLine());
		}
		if(sc != null)
			sc.close();

		return namesList;
	}

	public int compute(int a, int b, Operator ope) {

		if (ope == Operator.PLUS) {
			return a + b;
		} else if (ope == Operator.MINUS) {
			return a - b;
		} else if (ope == Operator.MUL) {
			return a * b;
		} else if (ope == Operator.DIV) {
			if (b == 0) {
				throw new ArithmeticException("Value of b can't be zero but you send it as :" + b);
			}
			return a / b;
		} else if (ope == Operator.MOD) {
			return a % b;
		}
		throw new IllegalArgumentException("Please provide valid operator(PLUS,MINUS,MUL,DIV,MOD)");
	}
}

public class ThrowAndThrows {

	public static void main(String[] args) {
		
			MyMath obj = new MyMath();
			int res = obj.compute(10, 20, Operator.PLUS);
			System.out.println(res);
	}
}
