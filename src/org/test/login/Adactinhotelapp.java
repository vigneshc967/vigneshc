package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
	WebElement txtqq = driver.findElement(By.id("username"));
	txtqq.sendKeys("vignesh");
	
	
	WebElement txtcc = driver.findElement(By.id("password"));
	txtcc.sendKeys("123456789");
	
	
	String attribute = txtqq.getAttribute("value");
	System.out.println(attribute);
	
	String attribute2 = txtcc.getAttribute("value");
	System.out.println(attribute2);
	
	
	
	}
	

}
