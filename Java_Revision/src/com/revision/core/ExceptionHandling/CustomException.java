package com.revision.core.ExceptionHandling;

public class CustomException {

	public static void main(String[] args) {


		int age = Integer.parseInt(args[0]);
		
		if(age > 60) {
			
			throw new TooOldException("your age is already crossed marriage age.. no chance of getting marriage ");

		}
		else if( age< 18) {
			
			throw new TooYoungException("plz wait some more time ... you will get best match soon...");

		}
		else {
			System.out.println("you will get match details soon by email...!");
		}
	}

}
