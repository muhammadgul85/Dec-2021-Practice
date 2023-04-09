package com.keyword.callbyvalue.callbyreference.statickeyword;
/*why we use static key word ? We can overcome duplication, e.g. common variable for different classes
It will save memory,
The variable will be common variable among all objects
Modify in one place, it will be changed in all places
Static Method will also be common

Restriction:
-----------------------
1) static methods can access only static stuff(static variables & static methods in same class)-Directly. you don't need to create object of clastatic methods can access only static stuff(static variables & static methods in same class)-Directly. you don't need to create object of classss
2) static methods can also access non-static stuff but through object.
3) Non-static methods can access every thing directly.

*/
public class Static_KeyWord {
	
	static int a = 20;// static variable
	int b = 30; //non static variable
	
	static void m1 () //static variable
	{
		System.out.println("Static method");
		
	}
	
	void m2 () //non static variable
	{
		System.out.println("Non Static Method");
	}
	
	//3) Non-static methods can access every thing directly, we don't need to create any object
	void m3()// non static method 
	{
		System.out.println("output from m3 method");
		System.out.println(a);//static variable
		System.out.println(b);//non static variable
		m1();//static method
		m2();//non static method
	}
	
/*	public static void main(String[] args) {//main is also static method
		
		//We can access static var and method directly as we are in main method which is static method	
		System.out.println(a);
		m1();
		
		//try to access non static var and non static method, error:
	/	System.out.println(b);
		m2();
		/
		//2) static methods can access non-static stuff but through object.
		
		Static_KeyWord se = new Static_KeyWord ();
		se.m2();
		System.out.println(se.b);
		
		//3) Non-static methods can access every thing directly, we don't need to create any object
		se.m3(); //we are calling it through object
		// compare with m1(); which we don't have to call via object
		
	}*/


}
