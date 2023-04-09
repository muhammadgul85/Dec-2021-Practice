package com.conditional.statements;

public class Fibionacci_While_Loop {
	public static void main(String[] args) {
		
		int count=7, num1 =0, num2=1;
		System.out.println("Fibionacci series "+ count + " numbers: ");

		
		int i =1;
		while(i<=count)
		{
			System.out.println(num1 + " ");
			int sumofprevioustwo = num1 + num2;
			
			num1=num2;
			num2=sumofprevioustwo;
			i++;
			
			
		}
		
		
	}

}
