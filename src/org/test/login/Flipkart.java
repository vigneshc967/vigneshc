package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement txtrr = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtrr.sendKeys("123456789");
		
		String attribute = txtrr.getAttribute("value");
		System.out.println(attribute);
	}

}
