package com.lumen.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AD36043/chromedriver/chromedriver-win64/chromedriver.exe");

		 

        WebDriver driver = new ChromeDriver();



        driver.get("http://demo.guru99.com/test/drag_drop.html");

        



       //Clicking on button or Link



        JavascriptExecutor js = (JavascriptExecutor) driver;



        WebElement element = driver.findElement(By.xpath("//a[@class='button button-orange'][contains(text(),'SALES')]"));



        js.executeScript("arguments[0].click();", element);



       

        //Scroll Down by pixels



        //js.executeScript("window.scrollBy(0,600)");



        



        //Scroll Up by pixels



     //   js.executeScript("window.scrollBy(0,-600)");



        

//

//        //Scroll Down by pixels

//

// 
        js.executeScript("window.scrollBy(0,600)");

//

//        

//

//        //Scroll Down by pixels

//

//        js.executeScript("window.scrollBy(0,600)");

//

//

//

//        //Scroll Down by pixels

//

//        js.executeScript("window.scrollBy(0,600)");

//

//        

//

//        //Scroll Element intoView

//

//        js.executeScript("arguments[0].scrollIntoView(true);", element);

//

//        

//

//        //Scroll Horizontally:

//

//        js.executeScript("window.scrollBy(600,0)");

//

//        

//

//        

//

//Scroll down the page till bottom:

//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//

//

//

//     

//      //Scroll down the page till top:

//js.executeScript("window.scrollTo(0, - document.body.scrollHeight)");

//  

//}


	
	}
}

