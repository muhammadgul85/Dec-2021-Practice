package com.keyword.callbyvalue.callbyreference.statickeyword;
//We are using method and variables from Static_Keyword Java
//we have to use class name(Static_Keyword) with var & Method as we are calling them from
//other class, within same class we don't need to use class name as given below
public class Use_Static_MethodVar_From_Static_keyword_Class {
	public static void main(String[] args) {
		//We can access static var and method directly as we are in main method which is static method	
				System.out.println(Static_KeyWord.a);
				Static_KeyWord.m1();//we used classed name as we are using from other class and method is static
				
				
				//try to access non static var and non static method, error:
				//System.out.println(b);
				Static_KeyWord.m1();///we used classed name as we are using from other class and method is stati
				
				//2) static methods can access non-static stuff but through object.
				
				Static_KeyWord se = new Static_KeyWord ();
				se.m2();
				System.out.println(se.b);
				
				//3) Non-static methods can access every thing directly, we don't need to create any object
				se.m3(); //we are calling it through object
				// compare with m1(); which we don't have to call via object
				
	}

}
