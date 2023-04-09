package com.java.practice;

public class Swap_2_Numbers {
	
	public static void main(String[] args) {
		System.out.println("Before Swapping");
		
		int x = 10;
		int y = 20;
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
		System.out.println("After Swapping ");
		
		x = x + y;
		System.out.println(x);//30
		y = x-y ; //30-20 =10
		x = x-y; //30-10=20
		System.out.println("value of x: "+ x);
		System.out.println("value of y: "+ y);
		
		
	}

}
