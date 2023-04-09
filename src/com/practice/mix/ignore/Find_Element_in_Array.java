package com.practice.mix.ignore;

public class Find_Element_in_Array {
	public static void main(String[] args) {
		
		
		int a [] = {10, 20, 30, 50, 300, 100, 400};
		
		
		//int num = 11;
		int num = 100;
		boolean flag = false;
		
		
		for (int i:a)
		{
			if(i==num)
			{
				System.out.println("Element found");
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
	}

}
