package com.keyword.callbyvalue.callbyreference.statickeyword;
//We have to pass the value to method as a parameter
//
public class CallByValue {
	
	int x;
	public void addition (int a)
	{
		x=a+5;
		//System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		CallByValue cv = new CallByValue ();
		cv.addition(10);//We are passing value to the method, it's Call by Value
		System.out.println(cv.x);
		
		
	}

}
