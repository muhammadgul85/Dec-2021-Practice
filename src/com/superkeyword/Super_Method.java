package com.superkeyword;

class superA

{
	public void testa(int a, int b)
	{
		System.out.println("SuperA, value of a: "+a + " value of b: " +b);
	}
}

class superB extends superA
{
	public void testa (int a, int b)
	{
		System.out.println("class b, vlaue of a: "+a+ " b: "+ b);
		super.testa(10, 29);
	}
}

public class Super_Method {
	public static void main(String[] args) {
		
		superB b = new superB();
		b.testa(20, 49);
		
	}

}
