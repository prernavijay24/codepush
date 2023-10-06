


package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	
	public static void main (String args[])
	{
		String currentWorkingDirectory = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",currentWorkingDirectory + "/drivers/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		
		
	}
	
}


