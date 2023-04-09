package com.Section5.ExceptionHandling;

import java.util.Scanner;

public class Multiple_Catch_Blocks {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
/*int a =0;
		
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is occured and handled successfully");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException is occured and handled successfully");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException is occured and handled successfully");
		}
		System.out.println("Program is in completed");

		System.out.println("Program is in Exited");
		*/
		
		
		int a =10;
		try
		{
		//System.out.println(a/0);
		String s = "Weclome";
		int n = Integer.parseInt(s);
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred and handled");
		}
	    finally
	    {

			System.out.println("Completed");
	    }

	}

}
