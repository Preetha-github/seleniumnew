package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		
		//Click on this image to go home page
		
		WebElement Homepage = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		Homepage.click();
		
		//go back to image page
		
		WebElement ImagePage = driver.findElement(By.xpath("//a[@href='pages/Image.html']"));
		ImagePage.click();
		
		Thread.sleep(2000);
		
		//Am I Broken Image?
		
		WebElement Broken = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		
		if (Broken.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken: " + Broken);
		}
		else
		{
			System.out.println("Image is NOT broken: " + Broken);
		}
		
		
		
		
		
	}

}
