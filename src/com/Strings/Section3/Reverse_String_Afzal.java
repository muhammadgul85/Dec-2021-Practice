package com.Strings.Section3;

public class Reverse_String_Afzal {
	public static void main(String[] args) {
		
		String m = "Muhammad Ali Khan";
		
		System.out.println("String size: " + m.length());
		
		for (int i=m.length()-1; i>=0; i--)
		{
			System.out.println(m.charAt(i));
		}
	}

}
