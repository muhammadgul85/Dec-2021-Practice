package com.class_objects_Methods_Constructor_Overloading;
/**
//* Same object behaving different different instance throughout the execution of the  program 
//* that is called a polymorphism
//* 
//* We have two type of polymorphism 
//* - Run Time polymorphism- can be achieved with Method over riding , inheritance and Upcasting
//* - Compile Time Polymorphism- Can be achieved with method Over loading - Assignment
//*/

class Animal 
{
	public void voice ()
	{
		System.out.println("Animal Voice: ");
	}
}

class dog extends Animal
{
	public void voice ()
	{
		System.out.println("Dog barks");
	}
}

class cat extends Animal 
{
	public void voice()
	{
		System.out.println("cat meow");
	}
}
class lion extends Animal 
{
	public void voice ()
	{
		System.out.println("Lion Roars");
	}
}
class bike 
{
	public void run ()
	{
		System.out.println("Running");
	}
}
class splender extends bike
{
	public void run () {
		System.out.println("\"running safely at 70m per hour\"");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		
		Animal a = new cat (); //This full command is Runtime polymorphism

		//new cat();   is upcasting (We have created object of main class"Animal" when run, it calls the method for cat class, (RunTime Polymorphism)
		Animal b = new dog ();
		Animal l = new lion();
		a.voice();
		b.voice();
		l.voice();		
		
		bike d = new splender ();// RunTime Polimorphism
		d.run();
		
	}

}
