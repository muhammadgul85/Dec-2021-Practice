package com.keyword.callbyvalue.callbyreference.statickeyword;

public class ThisKeyword_Constructor {

	int a, b;
	
	ThisKeyword_Constructor(int a, int b)
	{
	//	a=a;//similiar to method, we have to use this keyword to reference class variable
	//	b=b;//the output will be zero, see below with keyword
	
		this.a=a;
		this.b=b;
		
	
	}
	
	void display ()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("Sum of 2 no's: "+ (a+b));
	}
	
	public static void main(String[] args) {
		
		
		ThisKeyword_Constructor tkc = new ThisKeyword_Constructor (10, 20);
		tkc.display();
	}

}
