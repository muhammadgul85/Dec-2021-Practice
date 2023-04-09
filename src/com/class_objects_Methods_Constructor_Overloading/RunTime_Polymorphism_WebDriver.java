package com.class_objects_Methods_Constructor_Overloading;

class WebDriver
{
	public void WebDriverBrowser()
	{
		System.out.println("Open Browser");
	}
}

class ChromeDriver extends WebDriver
{
	public void WebDriverBrowser()
	{
		System.out.println("Open Chrome Browser");
	}
}

class Firefox extends WebDriver
{
	public void WebDriverBrowser()
	{
		System.out.println("Open firefox Browser");
	}
}



public class RunTime_Polymorphism_WebDriver {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver () ;
		WebDriver driver1 = new Firefox () ;
		driver.WebDriverBrowser();
		driver1.WebDriverBrowser();
	}

}
