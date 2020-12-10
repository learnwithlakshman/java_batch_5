package com.careerit.cj.day27;

import java.io.IOException;

class InsufficientBalanceException extends RuntimeException {

	InsufficientBalanceException(String message) {
		super(message);
	}

}

class OneException extends Exception{
	
}
class TwoException extends OneException{
	
}

class ThreeExcption extends TwoException{
	
}
class FourException extends Exception{
	
}

class One{
	
	void m1() throws TwoException {
		
	}
}

class Two extends One{
	
	void m1()  {
		
	}
}

public class CustomExcpetions {

}
