package com.Final.keyword;

//Q) What is final parameter?
//If you declare any parameter as final, you cannot change the value of it.
class Bike11
{
	int cube (final int n)
	{
		return n = n+2;//can't be changed as n is final  
	}
}




public class Final_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike11 b = new Bike11 ();
		b.cube(33);

	}

}
