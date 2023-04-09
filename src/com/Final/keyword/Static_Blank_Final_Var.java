package com.Final.keyword;
//A  static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

class A 
{
	static final int data;
	static {data = 50};//but this isn't working ??? Why ????
}




public class Static_Blank_Final_Var {
	public static void main(String[] args) {
		System.out.println(A.data);
		
	}

}
