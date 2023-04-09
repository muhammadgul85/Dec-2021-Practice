package com.conditional.statements;

public class Switch_Statement {

	public static void main(String[] args) {
		/* N Number of Conditions, use switch case statement, it will reduce your code
		switch case
		-----------
		switch(varaible)
		{
		case 1: statements; break;
		case2 : statements;break;
		--
		---

		default: statements
		}*/

		//int day =1;//variable
		//int day =5;
		int day =11;
		//switch, case are keyword
		switch (day)
		{
		//case 1: System.out.println("Sunday");break;  you can write in 1 line
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Mon");break;//break statement used to stop if statement is true so it doesn't execute next statement
		case 3: System.out.println("Tue");break;
		case 4: System.out.println("Wed");break;
		case 5: System.out.println("Thur");break;
		case 6: System.out.println("Fr");break;
		case 7: System.out.println("Sat");break;
		default: System.out.println("Invalid weekday number");
		}
		

	}

}
