package com.class_objects_Methods_Constructor_Overloading;
// predefined method .length (); , we just call it
//Class = Legal Entity Enity - Does not occupy space in memory
//Object = Physical Entity - Occupies Space

public class Class_Contains_Method_Var 
{
	int eid;
	String ename;
	int deptno;
	String job;
	
	void display() //user defined method
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	/*public static void main (String args[])
	{
		Class_Contains_Method_Var emp1 = new Class_Contains_Method_Var(); //create object emp1
		emp1.eid= 101;
		emp1.ename= "David";
		emp1.deptno= 10;
		emp1.job = "Manager";
		
		emp1.display();
		System.out.println("*****************");
		//you can create N number of objects from Class
		Class_Contains_Method_Var emp2 = new Class_Contains_Method_Var();
		emp2.eid=102;
		emp2.ename = "Job";
		emp2.deptno=20;
		emp2.job = "Engineer";
		emp2.display();
	}*/

}
