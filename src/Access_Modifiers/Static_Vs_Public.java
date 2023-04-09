package Access_Modifiers;

public class Static_Vs_Public {
	
	//static method
	static void mystaticmethod ()
	{
		System.out.println("Static method can be called without creating object");
	}
	
	//public method
	
	public void mypublicmethod ()
	{
		System.out.println("public method must be called by creating objects");
		
	}
	
	//main method
	public static void main(String[] args) {
		
		mystaticmethod ();// call the static method
//		mypublicmethod ();// This will throw error, create object as given below 
		
		
		Static_Vs_Public st = new Static_Vs_Public (); // create an object of the class
		st.mypublicmethod(); // call the public method
		
		
	}

}
