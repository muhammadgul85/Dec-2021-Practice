package com.class_objects_Methods_Constructor_Overloading;
/* Method= Small piece of code that contains logic
 * Method Vs Constructor
--------------------------
1) Method name can be anything.
   Constructor name should be same as class name

2) Methods , we have call explicitly through object	
   Constructor will be invoked at the time of object creation.

3) Method contains logic	
   Constructor contains only initilizations	

4) Methods can return some value
   Constructor will not return any value(not even void)
 */
public class Method {
	//Case 1 = Method not taking any param and not return output
	int x=100, y=200;
	/*void sum()
	{
		System.out.println(x+y);
	}*/
	
	//Case 2 - Not Taking Param - But Returning Output
	/*int sum() //method returning int, hence calling it int sum
	{
		return(x+y);
		
	}*/
	
	//Case 3 - Take parameters and not returns output
	/*void sum (int a, int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}*/
	
	//Case 4 - Taking Parameter - Return Output
	int sum (int a, int b)
	{
		x=a;
		y=b;
		return(x+y);
	}
	public static void main(String[] args) {
		//Case1
//		Method cal = new Method ();
//		cal.sum();
		
	//Case 2
		Method cal = new Method ();
//		int res = cal.sum();
//		System.out.println(res);
		
		//Case 3
		//cal.sum(10, 20);
		
		//Case 4
		
	    int res = cal.sum(20, 50);
	    System.out.println(res);
		
	}
	

}
