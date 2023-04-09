package com.collectionArrayListHashMapJDBC;

import java.util.ArrayList;

/*Arraylist is a predefined class
 * There is no size limit here
 * There is no restriction to store same kind of elements
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList ();//Declaration
		
		//How to add elements/values to array list
		list.add("Welcome");
		list.add(10);
		list.add(10.4);
		list.add(true);
		list.add('A');
		System.out.println("size: " +list.size());
		System.out.println(list.get(2));
		System.out.println("Initial List of Elements"+ list);
		list.add(1, "Selenium"); //add at number 1 
		System.out.println("list elements after add: " + list);
		list.remove(3);
		System.out.println("list of elements after remove: "+ list);
		

		System.out.println("Loop to print all values:");
		for (Object i: list) //Object is predefined class and we want to loop
		{
			System.out.println(i);
		}
		
	}

}
