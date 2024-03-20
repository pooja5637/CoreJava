package com.revision.core.Polymorphism;

class Bank {
	
	int getRateOfInterest() {
		
		return 0;
	}

}

class SBI extends Bank{
	
	@Override
	int getRateOfInterest() {
		
		return 8;
	}
}

class ICICI extends Bank{
	
	@Override
	int getRateOfInterest() {
		
		return 7;
	}
}


class AXIS extends Bank{
	
	@Override
	int getRateOfInterest() {
		
		return 9;
	}
}

public class BankOverridingEx
{
	public static void main(String[] args) {
		
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI rate of interest :"+ s.getRateOfInterest()); //8
		System.out.println("ICICI rate of interest :"+ i.getRateOfInterest()); //7
		System.out.println("AXIS rate of interest :"+ a.getRateOfInterest()); //9

	}
}
