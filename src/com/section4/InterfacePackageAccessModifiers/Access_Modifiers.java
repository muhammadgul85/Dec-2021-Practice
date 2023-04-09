package com.section4.InterfacePackageAccessModifiers;

class As

{
	private int c=100;
	private void m5()
	{
		System.out.println("private method");
	}
	int a = 10;//default
	void test1()
	{
		System.out.println("private");
	}
	
	
	int f =10;
	void m6()
	{
		System.out.println(f);
	}
	
	
	
	
}

public class Access_Modifiers {
	public static void main(String[] args) {
		
		As obj = new As ();
		obj.test1();
		System.out.println(obj.a);
		//obj.c=100;  // private access modifier
		//obj.m5();   // private access modifier
	}

}
