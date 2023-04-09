package com.Quiz;
/*
 * Static block executed before Main Method
 * Element in static block is not accessbile in main method
 */
public class Quiz6 {
	static
	{
		int a =5;
		System.out.println("value fo a: " +a);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
	}

}
