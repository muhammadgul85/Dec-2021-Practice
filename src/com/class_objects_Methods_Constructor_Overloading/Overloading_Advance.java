package com.class_objects_Methods_Constructor_Overloading;

class Overload1
{
	public void test(double a, int b)
	{
		System.out.println(a + " " + b);
	}
	public void test(long a, int b)
	{
		System.out.println(a + " " +b);
	}
}



public class Overloading_Advance {
	public static void main(String[] args) {
		Overload1 o1 = new Overload1 ();
		o1.test(10.11d, 22);
		o1.test(1100, 24422);
		
	}

}
