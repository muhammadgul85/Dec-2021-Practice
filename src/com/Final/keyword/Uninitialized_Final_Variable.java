package com.Final.keyword;
/*What is blank or uninitialized final variable?
A final variable that is not initialized at the time of declaration is known as blank final variable.

If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed, it is useful. For example PAN CARD number of an employee.

It can be initialized only in constructor.*/
class Bike10
{
	final int speedlimit;
	
	Bike10() //we can un-initialise final var in constructor only
	{
		speedlimit =80;
		System.out.println(speedlimit);
	}
}


public class Uninitialized_Final_Variable {
	public static void main(String[] args) {
		
		new Bike10();
		
		
	}

}
