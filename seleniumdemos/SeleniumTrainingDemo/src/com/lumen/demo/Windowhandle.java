package com.lumen.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("DRIVER SETUP");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new GeckoDriverInfo();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open2");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println("Title = " + title);

		String url = driver.getCurrentUrl();

		System.out.println("URL = " + url);

		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window handle "+parentwindow);
		
		Set<String> s = driver.getWindowHandles();
		java.util.Iterator<String> i1 = s.iterator();
		String parent = i1.next();
		String child = i1.next();
		
		System.out.println("Parent window handle "+parent);
		System.out.println("Child window handle "+child);
		driver.switchTo().window(child);
		Thread.sleep(10000);
		driver.close();
	}

}
