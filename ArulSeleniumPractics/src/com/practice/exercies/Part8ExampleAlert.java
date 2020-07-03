package com.practice.exercies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part8ExampleAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/preethasoundararajan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");

		// Click the button to display a alert box.
		WebElement AlertBox = driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		AlertBox.click();

		// driver.switchTo().activeElement().click();

		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(" =================================");
		System.out.println("Alert text is: " + " ' " + txt + " ' ");
		Thread.sleep(2000);

		alert.accept();

		// Click the button to display a confirm box.

		WebElement ConfirmBox = driver.findElement(By.xpath("//*[@onclick='confirmAlert()']"));
		ConfirmBox.click();

		Alert ConfirmAlert = driver.switchTo().alert();
		String ConfirmAlertTxt = alert.getText();

		Thread.sleep(2000);
		System.out.println(" =================================");
		System.out.println("Confirm alert text is: " + " ' " + ConfirmAlertTxt + " ' ");

		ConfirmAlert.dismiss();

		WebElement ConfirmBoxMsg = driver.findElement(By.xpath("//*[@id ='result']"));
		String ConfirmBoxAlertMsg = ConfirmBoxMsg.getText();
		System.out.println("Verification after clicking confirm alert : " + " ' " + ConfirmBoxAlertMsg + " ' ");
		
		
		// Click the button to display a prompt box.
		
		WebElement PromptBox = driver.findElement(By.xpath("//*[@onclick = 'confirmPrompt()']"));
		PromptBox.click();
		
		Alert PromptAlert = driver.switchTo().alert();
		String Promptxt = PromptAlert.getText();
		
		System.out.println(" =================================");
		System.out.println("Prompt alert text is: " + " ' " + Promptxt + " ' ");
		
		PromptAlert.sendKeys("lao");
		Thread.sleep(2000);
		
		PromptAlert.accept();
		

	}

}
