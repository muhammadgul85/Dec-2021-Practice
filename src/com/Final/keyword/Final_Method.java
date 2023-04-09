package com.Final.keyword;

class Bike11
{
	final void run ()
	{
		System.out.println("Running safely");
	}
}

class Honda extends Bike11
{
	void run ()
	{
		System.out.println("running at 1000mph");
	}
}


public class Final_Method {
	
	public static void main(String[] args) {
		//Bike11 b = new Bike11 ();
		//b.run();
		
		Honda  h = new Honda ();
		h.run();
	}

}
