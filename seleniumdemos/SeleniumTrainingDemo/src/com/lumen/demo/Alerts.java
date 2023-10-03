package com.lumen.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
        System.out.println("DRIVER SETUP");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title = " +title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL = " +url);

		Alert alert = driver.switchTo().alert();
		
		String s = driver.switchTo().alert().getText();
		
		System.out.println(s);
		
		Thread.sleep(1000);
		
		alert.dismiss();
	}

}
