package com.conditional.statements;

public class While_Loop {

	public static void main(String[] args) {
		/*Loops
		-----
		while 
		do..while
		for loop
		while is keyword
		while (condition)
		{
		statement;
		}
		----------------*/
		//print 1 to 10 Number, using while loop, with single statement we repeat the statement
		
		int i =1; //initial value
		while (i<=10)// this will be infinity, as it's not incrementing
			        //thefere use i++ to increment
		{
			System.out.println(i);
			i++;// i=i+1 , so without incrementing this will be inifinite loop
		}
		


	}

}
