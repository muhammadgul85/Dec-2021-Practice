package com.keyword.callbyvalue.callbyreference.statickeyword;

public class This_Keyword {
	
	int a, b; //Class varialbles//instance variables//global variables = can be access throughout the class
	
	/*void add (int x, int y)//method variables//external variables
	{
		a=x;
		b=y;
		
	}*/
	//Example Blow,  if we declare (int a, int b) in this method, when we run program
	//the output will be zero, as compiler wouldn't know, which variable are we calling
	//whether it's for method or class, therefore we can use same variable with the use
	//of keyword called this, so it knows we are calling class variable
	
	void add (int a, int b)
	{
		//a=a; if you run this the output will be 0, thefore we will use this keyword
		//b=b;
		this.a=a;// this.a is referring to class variable, whereas =a is referring to method variable
		this.b=b;
				
		
	}
	
	
	void display ()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("Sum of 2 no's: " + (a+b));
	}
	public static void main(String[] args) {
		This_Keyword th = new This_Keyword ();
		th.add(10, 20);
		th.display();
	}

}
