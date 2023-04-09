package com.Strings.Section3;

/*Write a java program to count the total number of occurrences of a given character 
in a string without using any loop?
  */
public class Count_Occurence_of_Character {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Java is java again java again";
		//char c = 'a';
		int count = s.length() -s.replace("a", "").length();
		
		System.out.println("Number of occurences of 'a' is: " + count);
		
		
		//not working the below one
		System.out.println("length of string without spaces: "+ s.replace("", "").length());
		System.out.println("length of string s with spaces: "+s.length());
		
		
		

	}

}
