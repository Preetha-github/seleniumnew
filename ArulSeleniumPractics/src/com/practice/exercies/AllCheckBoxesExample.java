package com.practice.exercies;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBoxesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input [@type='checkbox']"));
//		for (WebElement check : chkboxes) {
//			check.click();
//		}

		int size = chkboxes.size();
		System.out.println("Number of checkboxes in the page : " + size);
		
		for (int i = 0; i <= size; i++) {
	//		chkboxes.
			
		}
		
	}

}
