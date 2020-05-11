package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part5ExampleTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input")).sendKeys("test-text"+Keys.TAB);
		
		Thread.sleep(2000);
		
		
		WebElement retrivetext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String txt = retrivetext.getAttribute("value");
		System.out.println("The text is:"+ txt);
		
//		String retrievetext = driver.findElement(By.name("username")).getText();
//		System.out.println("The text in the textbox is" +	 retrivetext);

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		
		Thread.sleep(3000);
		
//		WebElement Textboxdisabled = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
//		boolean enabledbox =Textboxdisabled.isEnabled();
//		System.out.println(enabledbox);
	
		WebElement Textboxdisabled = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		String enabledBox = Textboxdisabled.getAttribute("disabled");
		System.out.println(enabledBox);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}
