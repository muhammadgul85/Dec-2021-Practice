package com.class_objects_Methods_Constructor_Overloading;

public class Student_Class {
	
	
	int sid;
	String sname;
	char grade;
	
	Student_Class (int id, String name, char g) //Constructor
	{
		sid =id;
		sname= name;
		grade=g;
	}
	
	//Aproach 2
	void getValue (int id, String name, char g)//parameters or argument
	{
		sid =id;
		sname= name;
		grade=g;
		
		
		
	}
	
	
	
	void display()//1st way //approach 1
	{
		System.out.println("Student ID: "+sid);

		System.out.println("Student Name: " + sname);

		System.out.println("Student Grade: " +grade);
	}
	
	

}
