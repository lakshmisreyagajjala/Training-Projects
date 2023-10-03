package com.lumen.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDemo {

	public static void main(String[] args) {

		System.out.println("DRIVER SETUP");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new GeckoDriverInfo();

		driver.get("https://www.facebook.com/r.php");

		driver.manage().window().maximize();

		String title = driver.getTitle();

		System.out.println("Title = " + title);

		String url = driver.getCurrentUrl();

		System.out.println("URL = " + url);

		driver.findElement(By.name("firstname")).sendKeys("Sreya");
		driver.findElement(By.name("lastname")).sendKeys("Gajjala");
		driver.findElement(By.name("reg_email__")).sendKeys("7995279571");
		driver.findElement(By.id("password_step_input")).sendKeys("Lmind@123");
		
		Select day = new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
		day.selectByIndex(16);
		Select month = new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
		month.selectByValue("3");
		Select year = new Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
		year.selectByVisibleText("2002");
		
		Boolean b = driver.findElement(By.className("_58mt")).isEnabled();
        if (b == true) {
        	driver.findElement(By.className("_58mt")).click();
		}
        
//		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		driver.findElement(By.linkText("Already have an account?")).click();
       

	}

}
