package com.Strings.Section3;

public class String_Present_Array_Assignment {
	public static void main(String[] args) {
		
		String a []= {"welcome", "lolly"};
		//String search = "loLLy";
		String search ="lolly1";
		boolean flag = false;
		
		for (String i:a)
		{
			if(i.equalsIgnoreCase(search))
			{
				System.out.println("String found");
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
