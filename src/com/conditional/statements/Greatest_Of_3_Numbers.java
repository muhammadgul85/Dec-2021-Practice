package com.conditional.statements;

public class Greatest_Of_3_Numbers {

	public static void main(String[] args) {
		/*If you have 3 numbers you have to use logical operator 
		
				x > y & z -- > x is largest
				y > x & z -- > y is largest
				z > x & y --> z is largest number*/
		
		
	int a = 10;
	int b = 20;
	int c = 30;
	if (a >b && a > c)
	{
		System.out.println("a is the largest number");
	}
	else if (b >a && b >c) //Nested if else statement
	{
		System.out.println("b is largest number");
	}
	else
	{
		System.out.println("c is largest number");
	}
				
	}

}
