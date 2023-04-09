package com.practice.mix.ignore;

public class FindElement_In_Array {
	
	public static void main(String[] args) {
		
		int b []= {2, 20, 100, 400, 500};
		//int num = 12;
		
		
		int num = 21;
		boolean condition = false;
		
		for (int i : b)
		{
			if(i == num)
			{
				System.out.println("Number found");
				condition = true;
				break;
			}
		}
		
		if(condition==false)
		{
			System.out.println("Number Not found");
		}
		
	}

}
