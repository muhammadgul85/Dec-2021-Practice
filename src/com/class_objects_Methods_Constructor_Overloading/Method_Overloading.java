package com.class_objects_Methods_Constructor_Overloading;
//No of parameters are different
//If No of parameters are same, then Data type should be different

public class Method_Overloading {
	
	int x, y;
	double z;
	
	int addition ()
	{
		x=10;
		y=20;
		return (x+y);
		
	}
	
	int addtion(int a, int b)
	{
		x=a;
		y=b;
		return (x+y);
	}
	
	double  addition (int a, double b)
	{
		x=a;
		z=b;
		return (x+z);
	}
	
	double addtion (int a, int b, double c)
	{
		x=a;
		y=b;
		z=c;
		return (x+y+z);
	}
	
	
	public static void main(String[] args) {
		
		Method_Overloading mo = new Method_Overloading ();
		System.out.println("1st Method: " +mo.addition());//1st Method
		
		System.out.println("2nd Method: " + mo.addtion(100, 100));//second method
		
		System.out.println("3rd MEthod: "+ mo.addition(200, 40.4));
		System.out.println("4th Method: " + mo.addtion(44, 43, 76.9));
	}
}
