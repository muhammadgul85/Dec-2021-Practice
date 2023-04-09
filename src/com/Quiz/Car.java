package com.Quiz;
/*
 * Constructor created inside Class
 * Constructor name same as class name
 * Contructor don't have return type e.g. void etc
 */
public class Car {
	int wheelsCount;
	int numberOfSeats;
	int windows;
	
	public Car ()
	{
		wheelsCount = 4;
		numberOfSeats = 4;
	}
	public Car ( int number)
	{
		numberOfSeats = number;
	}
	
	public Car (int a, int b)
	{
		wheelsCount =a;
		numberOfSeats =b;
	}
	
	//Copy Constructors
	
	public Car (Car c)
	{
		wheelsCount = c.wheelsCount;
		numberOfSeats=c.numberOfSeats;
		
	}
	
	
	public void start ()
	{
		System.out.println("Car is starting");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(1, 7);
		c1.windows=6;
		System.out.println("Wheels: "+c1.wheelsCount);
		System.out.println("Seats: "+c1.numberOfSeats);
		System.out.println("Windows: " +c1.windows);
		System.out.println("********");
		
		Car c2 = new Car (c1); //Passing object
		System.out.println(c1.wheelsCount);
		System.out.println(c1.numberOfSeats);
		
   /*
		c1.wheelsCount =4;       As we know it's common so we use constructor for them
		c1.numberOfSeats=5; 
		c1.windows=6;
		System.out.println("Wheels: "+c1.wheelsCount);
		System.out.println("Seats: "+c1.numberOfSeats);
		System.out.println("Windows: " +c1.windows);
		System.out.println("******");
		Car c2 = new Car();
		//		c2.wheelsCount =4;
		c2.numberOfSeats=4; 	
		c2.windows=8;
		
			System.out.println(c2.wheelsCount);
		System.out.println(c2.numberOfSeats);
		System.out.println(c2.windows);
	*/

		
	}

}
