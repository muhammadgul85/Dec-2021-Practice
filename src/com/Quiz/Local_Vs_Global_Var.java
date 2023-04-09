package com.Quiz;

public class Local_Vs_Global_Var {
	
	int a =1;//global variable
	
	public void method2 (int a)//local variable a
	{
		a += 1;
		System.out.println(++a);
		
	}
	public static void main(String[] args) {
		Local_Vs_Global_Var q1 = new Local_Vs_Global_Var ();
		q1.method2(2);//we are sending value 2 inside method 2
					 //then we have added 1, a + =1; = value is 3
					//then we have incrmented value to 4 by doing 
					//System.out.println(++a);
		//Here Global Variable has nothing to do
	}
	
	

}
