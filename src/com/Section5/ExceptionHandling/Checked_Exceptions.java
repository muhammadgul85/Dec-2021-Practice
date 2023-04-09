package com.Section5.ExceptionHandling;

public class Checked_Exceptions {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is Progress");
		
		/* First way
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		*/
		
		//With this approach we will import exception catch to main method level
		Thread.sleep(2000);//Hover over it and add the suggestion to handle the exception
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		
		
	}

}
