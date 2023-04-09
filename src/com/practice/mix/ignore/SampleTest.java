package com.practice.mix.ignore;

import java.util.Scanner;

import com.Interface.interface1;

public class SampleTest {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		/* Takins int as input
		 * System.out.println("Enter First Number ");
		int a = input.nextInt();
		System.out.println("Enter Second Number ");
		int b = input.nextInt();
		System.out.println("a+b= " +(a+b));
		
		Taking decimals as input
		System.out.println("First no");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("Dec no: "+ (a+b));*/
		
		//String as an input
		System.out.println("Enter First String");
		String a = input.next();
		System.out.println("Enter 2nd String");
		String b = input.next();
		System.out.println(a + " "+b);
		
		
	}
}
