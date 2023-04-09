package com.superkeyword;


class Animal
{
	String color = "White";
}
class dog extends Animal
{
	String color = "Balck";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperInitial_Value {
	public static void main(String[] args) {
		dog d = new dog ();
		d.display();
		
	}

}
