package com.inheritance_interface_accessmodifieer_superandfinal_keyword;
/**
 * inherit the property of parents class , that is called a inheritance 
 * Inheritance can we achieve with extends keywords in java
 * 
 */class B_England
{
	public void b_england()
	{
		System.out.println("bank of endland loan");
	}
}

class barclay extends B_England
{
	public void barclay()
	{
		System.out.println("barclay loan");
	}
}

class hsbc extends B_England
{
	public void hsbc ()
	{
		System.out.println("hsbc loand");
	}
}

public class Inheritance_Java {
	public static void main(String[] args) {
		
		
		barclay b = new barclay();
		b.b_england();
		b.barclay();
		System.out.println("*************");
		hsbc h = new hsbc ();
		h.b_england();
		h.b_england();
	}

}
