package com.practice.exercies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Part7ExampleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//dropdown1 - Select training program using Index
		
		WebElement dropdownIndex =  driver.findElement(By.id("dropdown1"));
		Select selectObj = new Select(dropdownIndex);
		
		selectObj.selectByIndex(3);
		Thread.sleep(2000);
		
		//dropdown2 - Select training program using Text
		
		 WebElement dropdownText= driver.findElement(By.name("dropdown2"));
		 Select selectObj2 = new Select(dropdownText);
		 
		 selectObj2.selectByVisibleText("Appium");
		 
		 
		 //dropdown3 - Select training program using Value
		 
		 WebElement dropdownValue= driver.findElement(By.id("dropdown3"));
		 Select selectObj3 = new Select(dropdownValue);
		 
		 selectObj3.selectByValue("1");
		 
		 //dropdown4 - Get the number of dropdown options
		 
		 WebElement dropdownOptions = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
	   	Select selectObj4 = new Select(dropdownOptions);
	   	
	   	List<WebElement> listoptions = 	selectObj4.getOptions();
	  int size = listoptions.size();
	   
	  System.out.println("Size of the list of Options: " + size);
	   
		//dropdown5 - You can also use sendKeys to select
	  
	  WebElement sendKeyObj = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
	  sendKeyObj.sendKeys("Loadrunner");
	  
	  Thread.sleep(3000);
	  
	  //dropdown6 - Multiple
	  
	  WebElement multiselect = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	  Select multiObj = new Select(multiselect);
	  
	  multiObj.selectByValue("1");
	  
	  multiObj.selectByValue("2");
	 
	  multiObj.selectByValue("3");
	  
		
	driver.quit();
		
		
		

		
		

		
		
		
	}

}
