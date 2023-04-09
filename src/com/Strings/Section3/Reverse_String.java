package com.Strings.Section3;

public class Reverse_String {
	public static void main(String[] args) {
		//We do not have a reverse string method in Java
		
		String s ="selenium";
		//Capture from last to first character, create another variable, append 
		//Use decremental loop, extract from last and append the new variable
		//1st, use length method, then charAt method
		
		int len = s.length();//8-1 
		String rev = "";
		
		for (int i=len-1;i>=0;i-- )
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse String: "+ rev);
		
	}

}
