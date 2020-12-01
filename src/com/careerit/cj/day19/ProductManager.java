package com.careerit.cj.day19;

public class ProductManager {

	public static void main(String[] args) {
		Product product1 = new Product("Dell", 45000);
		Product product2 = new Product("Lenvo", 50000);
		Product product3 = new Product("Sony", 50000);
		Product product4 = new Product("Apple", 150000);
		Product product5 = new Product("Stdio15 Dell", 55000);
		Product product6 = new Product("Lenovo Dell Thinkpad",60000);
		
		Product[] arr = {product1,product2,product3,product4,product5,product6};
		
	
		
		// Can you display all the product details
		
		for(Product ele:arr) {
			System.out.println(ele.toString());
		}
		
		// Can you display all the product names, which has price <= 55000
		System.out.println("------------------------------The products with price <= 55000--------------------------");
		for(Product ele:arr) {
			
				if(ele.getPrice() <= 55000) {
					System.out.println(ele.getName());
				}
		
		}
		
		// Can you display products whose name contains (d|D)ell init
		
		System.out.println("-----------------------------The products with name dell init---------------------------");
		
		for(Product ele:arr) {
			if(ele.getName().toLowerCase().contains("dell")) {
				System.out.println(ele);
			}
		}
		
		//Change product price (-10%) , which are having price is more than 55000
		
		for(Product ele:arr) {
			if(ele.getPrice() > 55000) {
				ele.setPrice(ele.getPrice() - (ele.getPrice() * .1));
			}
		}
		System.out.println("------------------- After discount -------------------------------------------------------");
		
		for(Product ele:arr) {
			System.out.println(ele.toString());
		}
		
		
	}

}
