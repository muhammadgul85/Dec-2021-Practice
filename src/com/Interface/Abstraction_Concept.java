package com.Interface;
/**
 * Abstract class we can declare with abstract keyword - that is must
 * In Abstract class we have Abstarct method and non Abstract Method
 * Abstract Class is not a 100% concrete class 
 * Abstract class is not a complete class , We can't create a object of Abstract class
 * Interface can achieve 100% Abstraction
 * 
 * There is difference between Abstraction and RunTime Polymorphism, In Abstraction method is not implemented, in Runtime it is, then it's overridden
 * Method names can be different as well in abstraction
 * We don't want to show the features to the user, therefore abstraction is used
 */

abstract class abc
{
	public void ShowEmpCard()
	{
		System.out.println("Adeeba is showing Employee Card");
	}
}

class Mehru extends abc
{
	public void dresscode()
	{
		System.out.println("Mehru is wearning home clothes");
	}
}

class hadi extends abc
{
	public void dresscode()
	{
		System.out.println("hadi is coming in formal wear");
	}
}
public class Abstraction_Concept {
	public static void main(String[] args) {
		
		
		hadi h = new hadi ();
		h.dresscode();
		h.ShowEmpCard();
		
		
	}

}
