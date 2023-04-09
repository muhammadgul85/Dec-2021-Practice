package com.Strings.Section3;

public class Concatenate_String_to_End_of_Other_String {
	public static void main(String[] args) {
		
		String s1 = "PHP Exercises and ";
		String s2 = "Python Exercises ";
		System.out.println("String s1: "+s1);
		System.out.println("String 2: "+ s2);
		String s3 = s1.concat(s2);
		//String s3 = s2.concat(s1);
		System.out.println("The concatenated string: "+s3);
		
		System.out.println("length of s1: "+s1.length());
	}

}
