package com.practice.exercies;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open chrome browser
				System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
				WebDriver driver = new ChromeDriver();

				// Launch google.co.in
				driver.get("http://google.co.in");

				// Using switch to
				 driver.switchTo().activeElement().sendKeys("Pondicherry" + Keys.ENTER);

				// Using element locator

				//driver.findElement(By.name("q")).sendKeys("" + Keys.ENTER);

				Thread.sleep(3000);

				
				driver.quit();
	}

}
