package com.Quiz;



public class Call_By_Value {
	
	
	public static void ChangeValue (int value)
	{
		value =10;
	}
	
	
	public static void main(String[] args) {
		int value =99;
		ChangeValue(value);
		System.out.println(value);
		
		
		
	}

}
