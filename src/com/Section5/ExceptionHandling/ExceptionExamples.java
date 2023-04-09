package com.Section5.ExceptionHandling;

import java.util.Scanner;

public class ExceptionExamples {
	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
	
        //Predefined class in predefined package
	/*	Scanner input = new Scanner (System.in);//system.in is command
		System.out.println("Enter number");
		int num = input.nextInt();
		
		int a=100;
		try
		{
			System.out.println(a/num);//ArithmeticException
		}
		catch (ArithmeticException e)//Run and input 0 
		{
			System.out.println("Exception occurred..and handled successfully");
		}
		
		*/
		
		
		
		
		
		//NumberFormatException
		
	String s = "Welcome";
	int n=0;	
	try
	{
		n = Integer.parseInt(s);//predefined method to convert string to number
	}
	
	catch(NumberFormatException e)
	{
		System.out.println("Exception occurred..and handled successfull");
	}
	
		System.out.println(n+100); 
		
		//Convert String to number
	/*	String s = "12345";
		int n = Integer.parseInt(s);//predefined method to convert string to number
		System.out.println(n+100);*/
		
	/*	String s = "null";
		System.out.println(s.length());//Null PointerException
		*/
		
		//Array index out of bond Exception
	//	int a [] = new int [5];
	//	a[10] = 100; // 0 to 4 location allowed only
		
		
		
		
		System.out.println("progress is completed");
		System.out.println("Program is exited");
		
		
		
		
		
		
	}

}
