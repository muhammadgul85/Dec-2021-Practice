package com.class_objects_Methods_Constructor_Overloading;
/**
 * Same methods different signature is called a method over loading
 */

class overloading
{
	public void test (int a, int b)
	{
		System.out.println( a + " "+b);
	}
	public void test(int c, int d, String e)
	{
		System.out.println(c + " "+ d + " "+ e);
	}
	public void test (int g, float z)
	{
		System.out.println(z + " " + z);
	}
}


public class Overloading_Method {
	public static void main(String[] args) {
		overloading ol = new overloading ();
		ol.test(10, 20);
		ol.test(22, 12.11f);
		ol.test(33, 22, "A");
	}

}
