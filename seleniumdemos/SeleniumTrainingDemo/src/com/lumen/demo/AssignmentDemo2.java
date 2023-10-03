package com.lumen.demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

//import dev.failsafe.internal.util.Assert;

public class AssignmentDemo2 {

	public static void main(String[] args) throws Exception {

		System.out.println("driver setup");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36149/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/elements";

		driver.get(url);

		driver.manage().window().maximize();

		// assert page title as ToolsQA

		String expectedTitle = "ToolQA";

		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);

		// verify ToolQA is displayed or not

		WebElement i = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));

		if (i.isDisplayed()) {

			System.out.println("ToolsQA is displayed");

		} else {

			System.out.println("img not displayed");

		}

		// click on text box section and enter the details.

		driver.findElement(By.cssSelector("li[id='item-0']")).click();// Text Box

		driver.findElement(By.id("userName")).sendKeys("Sreya");

		driver.findElement(By.id("userEmail")).sendKeys("Sreya123@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("New Green Hills PG");

		driver.findElement(By.id("permanentAddress")).sendKeys("Khajipet,Kadapa dist");

		// verify submit button is enable

		WebElement button = driver.findElement(By.xpath("//button[text()='Submit']"));

		if (button.isEnabled()) {

			System.out.println("Submit button is Enabled");

		}

		else {

			System.out.println("Submit button is Not Enabled");

		}

		// click on submit button

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// assert that the text displayed has same name & Email id

		WebElement nameEle = driver.findElement(By.id("userName"));

		WebElement EmailEle = driver.findElement(By.id("userEmail"));

		String actualName = nameEle.getText();

		String actualEmail = EmailEle.getText();

		String expectedName = "Sreya";

		String expectedEmail = "lucky124@gmail.com";

		Assert.assertEquals(actualName, expectedName);

		Assert.assertEquals(actualEmail, expectedEmail);

		// click on checkbox section

		driver.findElement(By.cssSelector("li[id='item-1']")).click();

	}

}
