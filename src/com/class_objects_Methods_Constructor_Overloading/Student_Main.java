package com.class_objects_Methods_Constructor_Overloading;

public class Student_Main {
	public static void main(String[] args) {
		
		//Student_Class stu1 = new Student_Class();//stu1 is object reference variable
	
		//Approach1 - Assigning the values using object reference variable
	   /* stu1.sid =100;
		stu1.sname = "Kiran";
		stu1.grade ='A';
		stu1.display();*/
		
		//Approach 2
		//stu1.getValue(101, "Kiran", 'A');
		//stu1.display();
		
		//Approach 3 - Use Constructor
		Student_Class stu1 = new Student_Class (200, "Jasmine", 'B');
		stu1.display();
		
		
	}

}
