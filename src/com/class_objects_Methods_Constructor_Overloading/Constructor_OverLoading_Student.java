package com.class_objects_Methods_Constructor_Overloading;

class student
{
	student (int id, String name, int age)
	{
		System.out.println("ID: "+ id + " "+ "Name: "+name + ", " + "Age "+age);
	}
}



public class Constructor_OverLoading_Student {
	public static void main(String[] args) {
		
		student s = new student (1, "Khalid", 38);

		student s1 = new student (2, "Rakja", 39);

		student s2 = new student (3, "Bhatti", 42);
		
		
		
	}

}
