package com.careerit.cj.day14;

public class BrandNames {

	public static void main(String[] args) {
		String data = "Lakshman-Infosys-Manager,Charan-TCS -Developer,Rajesh- Dell-Manager,John-Wipro-Developer";

		String[] dataArr = data.split(",");

		for (String userdata : dataArr) {
			String[] userArr = userdata.split("-");
			System.out.println(userArr[1].trim().toUpperCase());
		}

		String name = "Core Java";

		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

		String randomText = "learning java is fun and you can learn java by doing fun things";

		int count = 0;
		int ocount = 0;

		for (int i = 0; i < randomText.length(); i++) {
			char ch = randomText.charAt(i);
		
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;

			default:
				ocount++;
			}
		}
		System.out.println("Vowels count is:"+count);
		System.out.println("Other character :"+ocount);

	}
}
