package com.java.practice;

public class Operators_Demo {
	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		//arithmetic operators + - * / %
		//below will Concatonate 
		System.out.println("additon of a and b: "  +a+b);
		//for desired addtion operation use ()

		System.out.println("additon of a and b: "  +(a+b));

		System.out.println("division of a and b: "  +(a/b));

		System.out.println("Mult of a and b: "  +(a*b));

		System.out.println("Moduler of b and a: "  +(b%a));//percentile operator (remainder)
		//Relational Operator/comparison operators (Return Boolean value)
		//>= > <= != ==
		
		System.out.println(a>b);
		System.out.println(b>a);
		
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		/*incement & decrement operators 
		
		int e = 10;
		a = a+1
		a++ -- > 11*/
		
		a=100;
		//System.out.println("post incrment:" + (a++));//value is still 100 ?
		//a++ = post increment = it assign value then increment
		//++a = pre increment = increment then assign value 
		System.out.println("pre-increment: "+ (++a));
		/*pre-decrement & post-decrment
		int f = 100;
		int res = f--; //assign value to result, then decrment
		int rest = --f;//*/
		
	}

}
