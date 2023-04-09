package com.practice.mix.ignore;

public class Sum_An_Array {
	
	public static void main(String[] args) {
		
		
		int my_Array [] = {1, 3, 4, 5, 6, 5};
		int sum =0;
		
		for (int i: my_Array)
			sum +=i;
		System.out.println(sum);
	}

}

/*package com.Strings.Section3;

public class Sum_an_Array {
	
	public static void main(String[] args) {
		
		int my_Array [] = {1, 3, 4, 5, 8, 9, 19,8 };
		int sum =0;
		
		for (int i:my_Array)
			sum += i;
		System.out.println("The sum of Array: " +sum);
		
	

}
}*/