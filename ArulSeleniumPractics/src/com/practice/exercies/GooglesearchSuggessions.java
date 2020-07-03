package com.practice.exercies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglesearchSuggessions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http:\\google.com");

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("game of thrones");

		Thread.sleep(3000);

		List<WebElement> ListOfElements = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

		// List <WebElement> ListOfElements
		// =driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul"));
		int size = ListOfElements.size();
		System.out.println("Number of items in the List is: " + size);

		Thread.sleep(3000);

		for (WebElement li : ListOfElements) {
			System.out.println(li.getText());

		}

		// Print the suggestion that has word 'CAST' in it

//		for (WebElement li : ListOfElements) {
//
//			if (li.getText().contains("cast")) {
//				System.out.println("Suggestion that has the word cast is: " + li.getText());
//				li.click();
//				break;
//
//			}
//		}
		int position = 0;
		for (WebElement li : ListOfElements) {
			
			//li.getText();
			System.out.println("text is ***" + li.getText());
			position=position +1;
			if (position==3) {
				li.click();
				break;
			}
			
			
			
			
		} 
driver.quit();
	}

}
