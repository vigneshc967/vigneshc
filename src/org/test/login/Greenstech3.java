package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	Thread.sleep(3000);
	
	WebElement txtmm = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
	String text = txtmm.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	}

}
