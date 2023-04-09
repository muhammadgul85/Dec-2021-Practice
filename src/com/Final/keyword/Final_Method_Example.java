package com.Final.keyword;
//Is final method inherited?
//Ans) Yes, final method is inherited but you cannot override it. For Example:
class Bike5
{
	final void run()
	{
		System.out.println("running");
	}
}

class Honda2 extends Bike5
{
	
}

public class Final_Method_Example {
	public static void main(String[] args) {
		Honda2 h2 = new Honda2 ();
		h2.run();
		//new Honda2 ().run();
	}

}
