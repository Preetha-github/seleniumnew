package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part10ExampleCheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();

		// Select the languages that you know?

		WebElement Java = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		Java.click();

		WebElement Sql = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[3]"));
		Sql.click();

		// Confirm Selenium is checked
		WebElement Selenium = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean Selchecked = Selenium.isSelected();

		System.out.println("Is Selenium selected: " + Selchecked);

		// DeSelect only checked
		WebElement Checkselect1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		WebElement Checkselect2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));

		if (Checkselect1.isSelected()) {

			Checkselect1.click();

		}

		if (Checkselect2.isSelected()) {
			Checkselect2.click();
		}
		
		//Select all below checkboxes 
		
		WebElement Option1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
		Option1.click();
		
		WebElement Option2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
		Option2.click();
		
		WebElement Option3 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"));
		Option3.click();
		
		WebElement Option4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
		Option4.click();
		
		WebElement Option5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]"));
		Option5.click();
		
		WebElement Option6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]"));
		Option6.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
