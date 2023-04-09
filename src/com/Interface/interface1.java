package com.Interface;

interface ex1
{
	public void test1();
}

interface ex2
{
	public void test2();
	
}

interface ex3 extends ex1, ex2
{
	public void test3();
}

class c1 implements ex3
{

	@Override
	public void test1() {
		System.out.println("interface1 method implemented");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub

		System.out.println("interface2 method implemented");
		
	}

	@Override
	public void test3() {

		System.out.println("interface3 method implemented");
		
	}
	
}
public class interface1 {
	public static void main(String[] args) {
		
		c1 c = new c1();
		c.test1();
		c.test2();
		c.test3();
	}

}



