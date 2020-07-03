package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part9ExampleRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		//Are you enjoying the classes?
		
		WebElement RadioYes = driver.findElement(By.xpath("//input [@id='yes']"));
		RadioYes.click();
		
		Thread.sleep(3000);
		
		//Find default selected radio button
		
		WebElement RadioUnchecked = driver.findElement(By.xpath("//input[@name='news'][@value=0]"));
		boolean Unchecked = RadioUnchecked.isSelected();
		
		WebElement Radiochecked = driver.findElement(By.xpath("//input[@name='news'][@value=1]"));
		boolean Checked = Radiochecked.isSelected();
		
		System.out.println("1st Button is: " + Unchecked);
		System.out.println("2nd Button is: " + Checked);
		
		//Select your age group 
		
		WebElement age40 =driver.findElement(By.xpath("//input[@name='age'][@value=2]"));
		age40.click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
