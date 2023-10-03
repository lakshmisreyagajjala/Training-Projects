package com.lumen.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) {
		
		System.out.println("DRIVER SETUP");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();

		
		driver.manage().window().maximize();

		driver.get("http://www.browserstack.com");
		driver.manage().window().maximize();
		
		
		
	}

}
