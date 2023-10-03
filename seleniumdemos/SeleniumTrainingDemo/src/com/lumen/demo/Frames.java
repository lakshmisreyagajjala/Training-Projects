package com.lumen.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Frames {

	public static void main(String[] args) {

		System.out.println("DRIVER SETUP");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new GeckoDriverInfo();

		driver.get("https://demoqa.com/frames");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println("Title = " + title);

		String url = driver.getCurrentUrl();

		System.out.println("URL = " + url);
		
		driver.switchTo().frame("frame1");
		
		Boolean b = driver.findElement(By.id("sampleHeading")).isDisplayed();
		
		System.out.println("Found frame "+b);

	}

}
