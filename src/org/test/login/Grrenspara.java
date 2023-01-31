package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grrenspara {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get(" http://www.greenstechnologys.com/");
	
	Thread.sleep(3000);
	WebElement txtcc = driver.findElement(By.xpath("//button[@data-dismiss='modal']"));
	txtcc.click();
	
	
	Thread.sleep(3000);
	WebElement txtart = driver.findElement(By.id("article-wrapper"));
	String text = txtart.getText();
	System.out.println(text);
	
	
	
}
}
