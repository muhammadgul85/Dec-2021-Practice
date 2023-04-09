package com.conditional.statements;

public class Prime_No {
	public static void main(String[] args) {
		int n = 7;
		for (int i =2; i<7; i++)
		{
			if(n%i ==0)
			{
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("prime no");
	}
	

}
