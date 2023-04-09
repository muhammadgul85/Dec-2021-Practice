package com.practice.mix.ignore;

public class Even_Odd_Array {
	public static void main(String[] args) {
		
		
		int a [] = {1, 2, 4, 5, 6, 8, 9, 11, 13, 16};
		

		System.out.println("Even Nos: ");
		for (int i:a)
		{
			if (i%2 ==0)

			System.out.println(i);
		}

		System.out.println("Odd Nos: ");
		for (int i:a)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}
	}

}
