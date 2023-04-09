package com.conditional.statements;

public class Fibionacci_For_Loop {
	public static void main(String[] args) {
		
		int count =7, num1 =0, num2 =1;
		System.out.println("Fibionacci Series of "+count+ " Numbers:");
		
		for (int i=1; i<=count; i++)
		{
			System.out.println(num1+ " ");
			/* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
			
			int sumofprevioustwo = num1 + num2;
			num1 = num2;
			num2 = sumofprevioustwo;
			
			
			//Output: Fibonacci Series of 7 numbers:0 1 1 2 3 5 8
		}
		
	}

}
