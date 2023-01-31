package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	
	WebElement txtqq = driver.findElement(By.id("home-tab"));
	txtqq.click();
	
	WebElement txtpath = driver.findElement(By.xpath("//div[@class='col-lg-7']"));
	String text = txtpath.getText();
	System.out.println(text);
	
	
	
	
	
	
	}

}
