package com.practice.mix.ignore;

public class Avg_Value_of_Array {
	
	public static void main(String[] args) {
		
		/*int [] array = {1,2,3,4,5,6,7,8,9};
		int length = array.length;
		
		int sum =0;
		
		for (int i=0; i<array.length; i++)
			
		{
			sum += array[i];	
			}
		double average = sum/length;
		System.out.println("Average of Array: " + average); */
		
		
		int array [] = {1,3,4,5,6};
		int length = array.length;
		
		int sum = 0;
		
		for (int i=0; i<length;i++)
		{
			sum+=array[i];
		}
		
		double average = sum/length;
		System.out.println("Avg: " + average);

	}
	
}
