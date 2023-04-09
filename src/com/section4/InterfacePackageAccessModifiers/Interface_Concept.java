package com.section4.InterfacePackageAccessModifiers;
/*
 * Interface
-----------
An interface in java is a blueprint of a class. 
Interface contains final and static variables, whereas in Class we have to use final and static keywords specifically
Interface contains abstract methods.
Abstract Method = is a method contains definition but not body or implementation or logic.{}
Interface supports the functionality of multiple inheritance.
We can define interface with interface keyword.
The methods in interface are public.
Multiple Inheritance using interface only is possbile
Without class we cannot use interface
 */

interface A
{
	int a=10; //By default variable in interface are static and final
	void m1();//by default it's public, and abstract method
	
}


public class Interface_Concept implements A {

	
	public void m1() { // By default this is public method,so access modifier will be public. if you leave it default it will throw error (Compile)
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		Interface_Concept obj = new Interface_Concept ();// or you can also use A obj = new Interface_Concept(); 
														//we cannot create object of interface i.e. instantiation
														//neither we can inherit class to interface, we can implement interface in class
		obj.m1();//through object we are accessing method
		
	}
	
	
	

}
