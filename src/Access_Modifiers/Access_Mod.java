package Access_Modifiers;



public class Access_Mod {
	
	final int x =10;
	final double pi = 3.14;
	
	
	public static void main(String[] args) {
		
		Access_Mod myobj = new Access_Mod ();
	//	myobj.x = 10;// will generate an error: cannot assign a value to a final variable
	//	myobj.pi = 23;// will generate an error: cannot assign a value to a final variable
		System.out.println(myobj.x);
		
	}

}
