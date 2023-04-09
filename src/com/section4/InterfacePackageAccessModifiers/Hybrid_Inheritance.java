package com.section4.InterfacePackageAccessModifiers;
//Hybrid Inheritance is combination of Heirarchy + 
//you cannot inherit class to interface
//Class must be there to implement the interface
class A1 
{
	void m1()
	{
		System.out.println("This is m1 from A1 class.....");
	}
}

interface B1
{
	void m2();
}

interface B2
{
	void m3();
}

//inheriting A1 class and B1 & B2
public class Hybrid_Inheritance extends A1 implements B1, B2 
{
	public void m2()
	{
		System.out.println("This is m2 from B1 interface");
	}
	public void m3()
	{
		System.out.println("This is m3 from B2 interface");
	}
	
	public static void main(String[] args) {
		Hybrid_Inheritance hi = new Hybrid_Inheritance ();
		hi.m1();
		hi.m2();
		hi.m3();
}
	
	

}
