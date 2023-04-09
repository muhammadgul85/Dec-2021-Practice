package com.conditional.statements;

public class For_Loop_PRime_Num {
	public static void main(String[] args) {
	
		//int n =29;
		for (int i=2; i<=28; i++)
		{
			if(i%2 ==0)
			{
				System.out.println("not a prime no");
				return;// why we have used return, it's implementation ???????/
				       //if you don't use it it will still print the above statement and statement in below block
				
				
			}
		}
		
		System.out.println("prime no");
		
		
	}

}
