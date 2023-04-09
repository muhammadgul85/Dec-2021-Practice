package com.superkeyword;

class Ani
{
	Ani(int a)
	{
		System.out.println("Calling Ani");
	}
}

class Ani2 extends Ani
{

	Ani2(int a) {
		super(10);
		// TODO Auto-generated constructor stub
		System.out.println("Calling Ani");
	}
	
}


public class Super_Constructor {
	public static void main(String[] args) {
		
		Ani2 ani = new Ani2(10);
	
	}

}
