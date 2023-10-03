package com.lumen.demo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		
		System.out.println("DRIVER SETUP");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();
		
		driver.get("https://www.lumen.com/en-us/home.htm");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title = " +title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL = " +url);
		
		//code for tag
//		int i = driver.findElements(By.tagName("img")).size();
//		System.out.println("No of img tag: "+size);
		
		

	}

}
