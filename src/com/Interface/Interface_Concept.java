package com.Interface;
//void test1(); //non implemented method - Abstract Method,, /***
/**
 * Interface - In Interface we have only abstract method - No need to declare
 * any keyword like abstract All Non implemented method by default is abstract
 * We can't declare implemented in Interface Class inherits Class, Interface
 * inherits Interface whereas Class implements interface Multiple inheritance
 * possible with help of Interface, not possible with Class
 */
// It is used to achieve total abstraction. 
// Since java does not support multiple inheritance in case of class,
// but by using interface it can achieve multiple inheritance .
// It is also used to achieve loose coupling. 
// Interfaces are used to implement abstraction

interface concept
{
	void test1();//non implemented method - Abstract Method,, /***
	
}

interface concept1
{
	void test2();//no {} given, it's not implemented
}

interface concept2 extends concept, concept1 //multiple Inheritance
{
	void test3();
	
}

class inter implements concept2
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Test1 method from interface");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Test2 method from interface");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Teste method from interface");
		
	}
	
}

class boxing implements concept
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1 method implemented");
	}
	
}
public class Interface_Concept {
	public static void main(String[] args) {
		
		inter in = new inter();
		in.test1();
		in.test2();
		in.test3();
		boxing box = new boxing();
		box.test1();		
	}

}
