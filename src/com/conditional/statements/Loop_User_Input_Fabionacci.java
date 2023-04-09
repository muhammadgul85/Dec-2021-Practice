package com.conditional.statements;

import java.util.Scanner;

public class Loop_User_Input_Fabionacci {
	public static void main(String[] args) {
		
		
		int count, num1=0, num2=1;
		
		System.out.println("How many numbers you want in the sequence");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		scanner.close();
		System.out.println("Fibionacci series of: "+count + " numbers:");
		
		int i =1;
		while(i<=count)
		{
			System.out.println(num1 + " ");
			int sumofprevtwo =num1 + num2;
			num1 = num2;
			num2= sumofprevtwo;
			i++;
			
			
		}
	}

}
