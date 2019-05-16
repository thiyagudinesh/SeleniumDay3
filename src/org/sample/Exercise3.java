package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\eclipse-workspace\\Thiyagu\\selenium\\Day3\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		String ttl = driver.getTitle();
		System.out.println(ttl);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		WebElement contactus=driver.findElement(By.xpath("//a[@href='contact.php']"));
		contactus.click();
		WebElement name=driver.findElement(By.id("InputName"));
		name.sendKeys("Thiyagarajan Parthiban");
		WebElement email=driver.findElement(By.id("InputEmail1"));
		email.sendKeys("thiyagu@123");
		WebElement mobileNum=driver.findElement(By.id("InputSubject"));
		mobileNum.sendKeys("9876543210");
		WebElement message = driver.findElement(By.xpath("//textarea[@class='form-control input-message']"));
		message.sendKeys(" Request for Selenium Training");
		WebElement click=driver.findElement(By.id("submit"));
		click.click();
		
		
	}
	
	

}
