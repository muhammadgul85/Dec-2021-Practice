package com.class_objects_Methods_Constructor_Overloading;
public class Constructor_Java {
	//constructor name and class name should be same 


	//if we are not declaring any constructor in pgm -
	//java automatically create a default constructor  - 
	//wich is called a blank constructor
	//if person declare a construtor , than java not create any default constructor
	//constructor name and class name should be same 
	/*if we are not creating constructor, java automatically creates constructor, which is called a blank constructor
	If we declare a constructor, Java doesn't create default constructor
	cons a = new cons (); // here after new we declare constructor
	we can pass parameter to constructor, when we declare it 
	cons a = new cons (); // here we are creating object 'a' of class and calling constructor which is cons();
	If we don't call constructor, the program wouldn't run, hence we can't call object without calling constructor
	with changing signature you can use constructor overloading like method overloading with constructor
	Constructor Overriding is not possible as we have to use extend keyword, therefore it is not possible, 

	String by default is NULL , if you don't declare
	int by default is 0, if you don't declare it
	*/

	/*Constructor is used to initialize an object whereas method is used to displays/shows functionality of an object.

	Constructors are invoked implicitly whereas methods are invoked explicitly.

	Constructor does not return any value where the method may/may not return a value.

	In case constructor is not present, a default constructor is provided by java compiler. In the case of a method, no default method is provided.

	Constructor should be of the same name as that of class. Method name should not be of the same name as that of class.
	*/
	int x, y,z;
	
	Constructor_Java() // Non - Parameterised
	{
		x=1000;
		y=2000;
		System.out.println("Constructor: " +(x+y));
	}
	
	
	//2nd Constructor - Parameterised Constructor
	Constructor_Java(int a, int b)
	{
		x=a;
		y=b;
		
		System.out.println(x+y);
	}
	//3rd Constructor - Parameterised Constructor
		Constructor_Java(int a, int b, int c)
		{
			x=a;
			y=b;
			z=c;
			System.out.println(x+y+z);
		}
	
	
	public static void main(String[] args) {
		
		Constructor_Java cm = new Constructor_Java (10, 20, 30);
		
	
	}
	
}


/*
Java Constructor
--------------
1) constructor is special type of method.
2) constructor  name should be same as class name.
3) constructor  will automatically invoked at the object creation.
4) Only for initilization of varibles.
5) 2 types
	default constructor
	parameterized constructor 
6) constructor does not return any type(not even void)


Overlaoding - same cosntructor/methods can be defined within the same class.

method overloading
constructor overloading
---
Rules: 
---
1)Number of parameters are different
2) Data type of parameters should be different


Method Vs Constructor
--------------------------
1) Method name can be anything.
   Constructor name should be same as class name

2) Methods, we have call explicitly through object	
   Constructor will be invoked at the time of object creation.

3) Method contains logic	
   Constructor contains only initializations	

4) Methods can return some value
   Constructor will not return any value (not even void)

It is a special type of method which is used to initialize the object.
Every time an object is created using the new() keyword, at least one constructor is called.
It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

*/