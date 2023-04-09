package com.Strings.Section3;

public class string_Reverse {
	public static void main(String[] args) {
		
		String d = "Adeeba Hadi Mehru";
		System.out.println("Size of String: "+ d.length());
		
		for (int i=d.length()-1; i>=0; i--)
		{
			System.out.println(d.charAt(i));
		}
	}

}
