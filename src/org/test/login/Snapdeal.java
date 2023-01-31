package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement txtbb = driver.findElement(By.xpath("//input[@name='keyword'][1]"));
	txtbb.sendKeys("asus");
	
	Thread.sleep(3000);
	WebElement txtvv = driver.findElement(By.xpath("//a[@data-labelname='asus zenfone z010d back cover'][1]"));
	
	txtvv.click();
	
	
	
	
	}
	
	
	

}
