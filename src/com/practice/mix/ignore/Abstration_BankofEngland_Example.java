package com.practice.mix.ignore;

abstract class BankofEngland

{
	public void giveloan()
	{
		System.out.println("bank of eng advised to give loan");
	}
	
	abstract void loanrate();
}

class hsbc extends BankofEngland
{

	@Override
	void loanrate() {
		System.out.println("hsbc rate is hight at 8%");
		
	}
	
}

class barclays extends BankofEngland
{

	@Override
	void loanrate() {
		System.out.println("barclay rate is high too at 9%");
		
	}
	
}


public class Abstration_BankofEngland_Example {
	public static void main(String[] args) {
		
		hsbc h1 = new hsbc ();
		h1.loanrate();
		h1.giveloan();
		System.out.println("************");
		barclays b1 = new barclays ();
		b1.giveloan();
		b1.loanrate();
		
		
		
		
		
		
	}

}
