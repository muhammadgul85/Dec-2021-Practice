package com.Strings.Section3;

public class Strings_Comparison {
	public static void main(String[] args) {
		
		String s1 = "Sachin";
		String s2 = "Imran";
		String s3 = "Wasim";
		String s4 = "Asif";
		String s6 = "sachin";
		String s7 = "imran";
		
		System.out.println("s1 compare to s2: "+ s1.equals(s2));
		System.out.println("s2 to s7: "+ s2.equals(s7));
		System.out.println("s2 to s7 Ignore cases: "+s2.equalsIgnoreCase(s7));
		
		System.out.println(s3.equals(s4));
		System.out.println(s6.equalsIgnoreCase(s1));
	}

}
