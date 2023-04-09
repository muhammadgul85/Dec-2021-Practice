package com.class_objects_Methods_Constructor_Overloading;
//runtime polymorphism is applicable to method only-= methods overriden 
// Not the data members ..example below
class Bike1
{
	int speedlimit = 90;
}

class honda extends Bike1
{
	int speedlimit =150;
}


public class RunTime_Poly_ApplicableTo_Method_Only {
	public static void main(String[] args) {
		Bike1 b = new honda ();
		System.out.println(b.speedlimit);
	}

}
