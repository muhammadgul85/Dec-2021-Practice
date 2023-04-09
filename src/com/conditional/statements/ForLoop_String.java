package com.conditional.statements;

public class ForLoop_String {
	public static void main(String[] args) {
		
		String m = "Muhammad Ali";
		System.out.println("length of string: "+ m.length());
		
		for (int i=1; i< m.length(); i++)
		{
			System.out.println(m.toCharArray());
			System.out.println("char at 0 is: " + m.charAt(0));
			break;
		}
		
		
	}

}
