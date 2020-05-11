package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part4ExampleLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		Thread.sleep(3000);
		
		//WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
		
		WebElement homepagelink = driver.findElement(By.partialLinkText("Home Page"));
		
		homepagelink.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
