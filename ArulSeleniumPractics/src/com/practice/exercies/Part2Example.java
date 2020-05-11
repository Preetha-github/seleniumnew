package com.practice.exercies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Part2Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Open firefox browser
				System.setProperty("webdriver.gecko.driver", "/Users/preethasoundararajan/Downloads/geckodriver");
				WebDriver driver = new FirefoxDriver();

				// Launch google.co.in
				driver.get("http://google.co.in");

				// Using switch to
				// driver.switchTo().activeElement().sendKeys("Trichy" + Keys.ENTER);

				// Using element locator

				driver.findElement(By.name("q")).sendKeys("Villupuram" + Keys.ENTER);

				Thread.sleep(3000);

				driver.quit();

	}

}
