package com.lumen.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractionOfWebTables {

	public static void main(String[] args) {

		System.out.println("DRIVER SETUP");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new EdgeDriver();

		
		driver.manage().window().maximize();

		driver.get("http://elvery.net/demo/responsive-tables/");
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,\"table-bordered\")])[3]"));
		List<WebElement> rowsList = table.findElements(By.tagName("tr"));

		List<WebElement> columnsList = null;

		for (WebElement row : rowsList) {
			System.out.println();
			columnsList = row.findElements(By.tagName("td"));

			for (WebElement column : columnsList) {
				System.out.print(column.getText() + ", ");
			}

		}

	}

}
