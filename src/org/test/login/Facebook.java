package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtvv = driver.findElement(By.id("email"));
		txtvv.sendKeys("vignesh");
		
		WebElement txtrr = driver.findElement(By.id("pass"));
		txtrr.sendKeys("8888888");
		
		
		String attribute = txtvv.getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = txtrr.getAttribute("value");
		System.out.println(attribute2);
		
		
	}

}
