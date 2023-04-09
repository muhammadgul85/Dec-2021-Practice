package com.collectionArrayListHashMapJDBC;

import java.util.HashMap;
import java.util.Map;

/*HashMap
----------
declare HASHMAP
add pairs to hashmap
remove pairs from hashmap
read pairs from hashmap
*/


public class HashMap_Demo {

	public static void main(String[] args) {
		
		// declare HASHMAP (Keys, Values, we must specify their type)
		
		HashMap <Integer, String> hm = new HashMap <Integer, String> ();//Integer, String is prediefined class in Java
		//Now add pairs (key, value to HashMap)
		hm.put(101, "John");//key has to be unique, value can be duplicate
		hm.put(102, "David");// .put is to add (method)
		hm.put(103, "Smith");
		hm.put(104, "Scott");
		hm.put(105, "Kim");
		System.out.println("full list---------: " + hm);
		
		//remove pairs from hashmap (via keys only) no index required (We cannot remove all, but one by one)
		hm.remove(103);
		System.out.println("after removing pair: "+ hm);
		
		// How to read pairs from HashMap (Entry = 1 pair, EntrySet= All pairs)
		
		for (Map.Entry m:hm.entrySet()) //store in variable m, m is representing entry, M IS VARIABLE OF TYPE MAP.ENTRY
		{								//m contains key and value so we have to seperate them
										//m.getKey();  m.getValue(); TO CAPTURE KEY AND VALUE SEPARATELY
			System.out.println(m.getKey() + "  " + m.getValue());
			
		}
	}

}
