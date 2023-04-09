package com.Strings.Section3;

public class String_Methods {
	
	public static void main(String[] args) {
		String s = "Welcome";
		int length = s.length();
		System.out.println(length);
		System.out.println();
//		int FirstChar= s.charAt(0);
//		System.out.println(FirstChar);
		String s1 ="Welcome";
		String s2 = "to Selenium";
		System.out.println(s1+ " " +s2);
		System.out.println("Weclome "+  "to Selenium");
		//Concat
		System.out.println(s1.concat(s2));
		//Trim
		s = "    java programing language ";
		System.out.println("No Trim: " +s);
		System.out.println("after Triming: " + s.trim());
		s="Welcome";
		
		//charAt():
		System.out.println("charAt: " +s.charAt(1));
		System.out.println("charAT: "+s.charAt(0));
		
		//contains(): ---> True/False (boolean)
		System.out.println("ContainsMethod: "+s.contains("come"));
		System.out.println("Contains W: "+ s.contains("W"));
		System.out.println("Contains Cap C: "+s.contains("C"));
		
		//equals():
		s="Welcome";
		System.out.println(s.equals("Welcome"));

		System.out.println(s.equals("welcome"));
		
		//equalsIgnoreCase()://not case sensitive

		System.out.println(s.equalsIgnoreCase("wELcome"));
		
		//replace():
		String f = "Welcome to Java and Welcome to Selenium";
		
		System.out.println(f.replace('e', 'A'));

		System.out.println(f.replace("Welcome", "xyz"));
		
		//Substring(): Return of a string based on a starting index and ending index
		//Starting index starts with 0
		//Ending index starts with 1
		System.out.println(f.substring(0, 2));
		System.out.println(s.substring(2, 4));
		
		//TOLOWERCASE():
		
		System.out.println(f.toLowerCase());
		
		//TOUPPDERCASE():
		
		System.out.println(f.toUpperCase());
		
	}

}
