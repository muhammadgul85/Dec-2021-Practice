package com.Quiz;

public class final_LocalVar_Comp_Error {
	public static void main(String[] args) {
		final int x = 10;
		
		x = twenty ();
		System.out.println(x);
	}
	
	static int twenty()
	{
		return 20;
	}
	
	

}
