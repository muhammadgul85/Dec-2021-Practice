package com.class_objects_Methods_Constructor_Overloading;

class wildanimal
{
	public void animal()
	{
		System.out.println("Animal Eats food");
	}
}

class lion1 extends wildanimal
{
	public void animal()
	{
		System.out.println("lion eats meat");
	}
}
class dog1 extends wildanimal
{
	public void animal()
	{
		System.out.println("Dog eats bones");
	}
}

class dolphin extends wildanimal 

{
	public void animal ()
	{
		System.out.println("dolphin eats fish");
	}
	
}
public class Polymorphism_WildAnimal {
	public static void main(String[] args) 
	{
		
		/*wildanimal l = new lion ();
		wildanimal d = new dog ();
		wildanimal pn = new dolphin ();*/
		//Another way
		wildanimal w;
		w = new lion1();
		w.animal();
		
		w = new dog1();
		w.animal();
		
		w= new dolphin ();
		w.animal();
		
		
	}

}
