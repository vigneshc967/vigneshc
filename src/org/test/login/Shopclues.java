package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigne\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html ");
		
		
		WebElement txtqq = driver.findElement(By.id("autocomplete"));
		txtqq.sendKeys("mobiles");
		
		
		Thread.sleep(3000);
		WebElement txtbb = driver.findElement(By.xpath("//a[@class='anchorHighlight'][1]"));
		txtbb.click();
		
	}

}
