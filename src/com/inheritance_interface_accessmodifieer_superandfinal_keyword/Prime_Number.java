package com.inheritance_interface_accessmodifieer_superandfinal_keyword;

import java.util.Scanner;

public class Prime_Number {
	public static void main(String[] args) {
		   
		int temp;
		
		boolean isPrime =true;
		
		Scanner scan = new Scanner (System.in);
	    
		System.out.println("Enter any number");
		//capturing input in an integer
		
		int num = scan.nextInt();
		scan.close();// here onward not sure how it worked ?????
		
		for (int i = 2; i <=num/2; i++)
		{
			temp = num%i;
			if (temp == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if (isPrime)
		
			System.out.println(num +" is a Prime Number");
			else
				System.out.println(num + " is not a Prime Number");
				
	}

}
