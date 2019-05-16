package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\eclipse-workspace\\Thiyagu\\selenium\\Day3\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.className("_2zrpKA"));
		login.click();
		WebElement userName = driver.findElement(By.className("_2zrpKA"));
		userName.sendKeys("7418108600");
		WebElement passw = driver.findElement(By.className("_2zrpKA _3v41xv"));
		passw.sendKeys("Kalai$987");
	}

}
