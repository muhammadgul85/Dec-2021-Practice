package com.class_objects_Methods_Constructor_Overloading;
/**
 * Same method same signature but different implementation is called a method over riding and we can achieve this with inheritance
 */
class c1 
{
	public void overriding1 (int a, int b)
	{
		System.out.println("Addtion: " + (a+b));
	}
}

class c2 extends c1 
{
	public void overriding1 (int a, int b)
	{
		System.out.println("Multiplication: " + (a*b));
	}
}

class c3 extends c1 
{
	public void overriding1 (int a, int b)
	{
		System.out.println("division: " + (a/b));
	}
}
class c4 extends c1 
{
	public void overriding1 (int a, int b)
	{
		System.out.println("division: " + (a%b));
	}
}

public class OverRiding_Method {
	public static void main(String[] args) {
		
		
		
		
		
	}

}
