package com.Final.keyword;
//if you make class final, you cannot extend it

final class Bike
{
	
}

class Honda1 extends Bike
{
	void run ()
	{
		System.out.println("honda bike extends and runs");
	}
}
public class Final_Class {
	public static void main(String[] args) {
		Honda1 honda = new Honda1 ();
		honda.run();
	}

}
