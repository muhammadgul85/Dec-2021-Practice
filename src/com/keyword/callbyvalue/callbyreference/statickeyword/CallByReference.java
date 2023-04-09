package com.keyword.callbyvalue.callbyreference.statickeyword;
//We have to pass Object to method as a parameter
public class CallByReference {
	
	int x;
	
	public void addtion(CallByReference a)
	{
		x=a.x+4;
		//System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		CallByReference cr = new CallByReference ();
		cr.x= 11; //
		cr.addtion(cr);
		System.out.println(cr.x);
		
		
		
		
	}

}
