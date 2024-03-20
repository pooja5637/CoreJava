package com.revision.core.DataHiding;

public class Test {

	public static void main(String[] args) {


		Account a = new Account();
		
		a.setBalance(200);
		System.out.println(a.getBalance()); //200
		a.setBalance(300);
		System.out.println(a.getBalance()); //500
		
	}

}
