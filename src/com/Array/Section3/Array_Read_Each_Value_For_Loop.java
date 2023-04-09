package com.Array.Section3;

public class Array_Read_Each_Value_For_Loop {
	public static void main(String[] args) {
		
		
		int d [] = {100, 200, 300, 400, 500, 600};
		//classic way and let's say you don't know size of array
		//i<=d.length-1; or i<=d.length (Choose)

		System.out.println("Length of d Array :" +d.length);
		//Below is Classic For Loop, Check Enhanced in For_Each_Lopp_Array
		for (int i=0; i<=d.length-1; i++)
			
		{
			
			System.out.println(d[i]);
		}
		
		System.out.println("value of 5th element: " + d[4]);
	}

}
