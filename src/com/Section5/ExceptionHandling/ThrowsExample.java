package com.Section5.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ThrowsExample {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr = null;
		fr = new FileReader ("C:\\Users\\User\\Desktop\\selenium.txt");
		
		BufferedReader bfr = new BufferedReader (fr);
		System.out.println(bfr.readLine());
		Thread.sleep(2000);
		
	}

}
