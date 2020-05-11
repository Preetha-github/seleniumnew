package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part6ExampleButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		
		Thread.sleep(1000);
		
		// Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		Thread.sleep(1000);
		
		// Click button
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]")).click();
		
		Thread.sleep(1000);
		
		//Find position of button (x,y)
    	WebElement position =driver.findElement(By.id("position"));
    		Point xypoint =	position.getLocation();
    		int x = xypoint.getX();
    		int y = xypoint.getY();
    		System.out.println("x position is:"+ x + "; y position is:" + y);
    		
    		Thread.sleep(2000);
		

		//Find button color
		WebElement bkcolor = driver.findElement(By.id("color"));
		String btxt = bkcolor.getCssValue("background-color");
		System.out.println("The background color is:" + btxt);
		
		Thread.sleep(2000);
		
		//Find the height and width
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().getWidth();
		System.out.println("Height is : " + height + "; Width is :" + width);
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
