package com.conditional.statements;

public class Nest_If_Else {
	
	public static void main(String[] args) {
		//int day =1;
		//int day =7;
		int day =15;
		if (day==1)
		{
			System.out.println("Sunday");
		}
		else if (day ==2)
		{
			System.out.println("Mon");
		}
		else if (day ==3)
		{
			System.out.println("Tue");
		}
		else if (day ==4)
		{
			System.out.println("Wed");
		}
		else if (day ==5)
		{
			System.out.println("Thur");
		}
		else if (day ==6)
		{
			System.out.println("Fri");
		}
		else if (day ==7)
		{
			System.out.println("Sat");
		}
		else
		{
			System.out.println("Invalid number for the day");
		}
	}
}
