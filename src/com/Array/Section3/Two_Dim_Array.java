package com.Array.Section3;
/*
 * Dec 2 dim array
 * insert values
 * find size
 * read values
 */
public class Two_Dim_Array {
	public static void main(String[] args) {
		
		// Two Dim Array,ways to declare,  int a [] [] = new int [3][2]; or  int [] [] a = new int [3][2]; or int [] a [] = new int [3][2];
		             // 3 Rows and 2 Columns
					// 0,1,2 Rows and Coumn 0,1 
		
		//a[0][0] =100;
		// Row 0 and Colum 0 = value 100;
		//Dec Array,   
		//Row Index & Column Index
		/*int a [][] = new int [3][2];
		a[0][0]=100; //First Row, First Column
		a[0][1]=200; //First Row, 2nd Column
		
		a[1][0]=300;//2nd Row, First Column
		a[1][1]=400;//2nd Row, 2nd Column
		
		a[2][0]=500;//3rd Row, First Column
		a[2][1]=600;//3rd Row, 2nd Column*/
		
		//If you don't know size create Dynamic Array
		
		int a [][]= {{100,200},{300,400},{500,600}};//Dynamic Array, here we have option to declare N of Rows N number of Columns 
		//System.out.println("No of Rows in Array a:" + a.length);
		//System.out.println("No of Columns in a: "+ a[0].length);// In Row 0 how many columns?
		
		//How to read data from Two dimensional Array
		//Nested Loop/inner loop
		
		/*for (int i=0; i<a.length; i++)//i represents row index
		{							   //i is 0
			for (int j=0;j<a[i].length; j++)//j represents the column
											//
			{
				System.out.println(a[i][j]);//loop through row (i) & then column(j)
				
				
			}
		}
		*/
		
		
		
			
		//	Enhanced For Loop to loop through dimensional array
		
		for (int r[]:a)
		{
			for (int i:r)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
