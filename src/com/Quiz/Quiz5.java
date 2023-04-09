package com.Quiz;

public class Quiz5 {
	
	static int x =99;

	public static void main(String[] args) {
		
		call(10);
		

	}
	
	static void call(int x)
	{
		//this.x =10; We do not access static variable in this way, but by calling class name and var
		//we can declare var as
		x=10;// this will print value of x =10 and this is right way, we don't use this keyword here
		System.out.println("Value of x= " +x);
		
		//however if you want to access Global var x=99; then use below
		System.out.println("Value of x: " + Quiz5.x);
	}

}
