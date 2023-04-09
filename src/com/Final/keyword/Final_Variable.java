package com.Final.keyword;
class Bike
{
	final int speedlimit=90;
	void run()
	{
		speedlimit =400;//remove final 
	}
	
}
public class Final_Variable {
	
	
	public static void main(String[] args) {
		Bike obj = new Bike ();
		obj.run();
		
	}

}
