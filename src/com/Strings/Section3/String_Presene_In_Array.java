package com.Strings.Section3;

public class String_Presene_In_Array {
	public static void main(String[] args) {
		
		String s [] = {"Welcome","selenium","java","python","javascript"};
		
		boolean flag =false;
		String search ="selenium";
		for(String i:s)
		{
			if(i.equals(search))
			{
				System.out.println("String found in Array");
				flag =true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String not found");
				
		}
		
		
	}		

}
