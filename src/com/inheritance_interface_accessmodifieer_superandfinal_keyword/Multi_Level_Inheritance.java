package com.inheritance_interface_accessmodifieer_superandfinal_keyword;
//multilevel inheritance == Step by Step Inheritance
//Multiple inheritance of class is not possible, but for interface it is

class grandfather
{
	public void eat()
	{
		System.out.println("Granpa eating");
	}
}

class father extends grandfather
{
	public void eat()
	{
		System.out.println("daddy eating");
		super.eat();
	}
}

class son extends father 
{
	public void eat ()
	{
		System.out.println("child eat popcorn");
		super.eat();
	}
}



public class Multi_Level_Inheritance {
	public static void main(String[] args) {
		
		
		grandfather g = new father ();
		grandfather b = new son ();
		g.eat();
		b.eat();
		
		
	}

}
