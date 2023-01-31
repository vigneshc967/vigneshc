package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		
		WebElement txtcc = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		txtcc.sendKeys("greens velmurugan");
		
		
		Thread.sleep(3000);
		
		
		WebElement txtvv = driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
		txtvv.click();
	
	    driver.quit();
	}

}
