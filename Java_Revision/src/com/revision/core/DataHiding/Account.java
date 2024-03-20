package com.revision.core.DataHiding;

public class Account
{
	/* Data hiding means outside person cannot access internal data or our internal data should not go out directly.
	 * 
	 * After validation or identification outside person access our internal data.*/

	// private -> outside person cannot access.
	// by declaring data member as a private we can achieve data hiding.
	private double balance;
	
	public double getBalance()
	{
		//validation 
		// if valid,
		return balance;
	}
	
	public void setBalance(double amount) {
		// validation whether correct person or not
		
		this.balance = this.balance + amount ;
	}
	

}

