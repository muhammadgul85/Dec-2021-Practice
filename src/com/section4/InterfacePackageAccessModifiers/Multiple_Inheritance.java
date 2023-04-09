package com.section4.InterfacePackageAccessModifiers;
//Multiple inheritance only possible with Interface, not with class
interface ABC
{
	int x =100;//In interface variable are final so we assign value to it
	void m1();
}

interface XYZ
{
	int y =200;
	void m2();
}


public class Multiple_Inheritance implements ABC, XYZ {
	
	public void m1()
	{
		System.out.println("value of x: " +(x+10));
	}
	
	public void m2()
	{
		System.out.println("value of y: " +(y+10));
	}
	public static void main(String[] args) {
		
		
		Multiple_Inheritance mi = new Multiple_Inheritance();
		mi.m1();
		mi.m2();
	}

}
