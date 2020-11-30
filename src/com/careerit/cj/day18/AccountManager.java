package com.careerit.cj.day18;

public class AccountManager {

	
		public static void main(String[] args) {
			
				
				
				Account[] arr = getAllAccounts();
				
				// Display the account count
				System.out.println(arr.length);
				
				// Display the all the account information
				for(Account acc:arr) {
					acc.showInfo();
					System.out.println("----------------------------------------------------------------------------------------------------");
				}
				
				
				// Display all the names of the account holders in upper case
				
				
				for(Account acc:arr) {
					System.out.println(acc.name.toUpperCase());
				}
				
				
				
		}

		
		
		
		
		
		
		
		
		
		
		
		private static Account[] getAllAccounts() {
			Account acc1 = new Account(1234567890,"Krish",5000,"krish.t@gmail.com");
		    Account acc2 = new Account(1234567999,"Tanvi",55000);
			Account acc3 = new Account(1234567777,"Dhatri",15000);
			return new Account[] {acc1,acc2,acc3};
		}
}
