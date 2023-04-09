package com.Array.Section3;
/*Declare an array
 * insert values into array
 * find size of an array
 * read values from array
 */
public class Single_Dimensional_Array {
	public static void main(String[] args) {
		
		
		int a[] = new int[5];//Declaring Array
		int b[] = new int[6];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[4]=400;
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		//you can add more values later as long as they don't exceed the size of array. 
		//if you don't know size of Array, see below
		int c []= {100, 200, 300, 400, 500};
		//int c[]= //Declaration
		//{100, 200, 300, 400, 500}; //Initialisation
		System.out.println("Size of c Array: "+c.length);

		System.out.println("Size of a Array: "+a.length);
		System.out.println("value of a 2 as per index: " + a[2]);//Extract specific values from array
		System.out.println("value of 1 of c Array as per index: " + c[1]);
		

	}

}
