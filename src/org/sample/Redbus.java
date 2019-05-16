package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\eclipse-workspace\\Thiyagu\\selenium\\Day3\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		WebElement trains = driver.findElement(By.xpath("//a[@title='Find trains to destinations within India']"));
		trains.click();
		WebElement src = driver.findElement(By.xpath("//input[@title='From station']"));
		src.sendKeys("Chennai Central (MAS)");
		WebElement dest = driver.findElement(By.xpath("//input[@title='To station']"));
		dest.sendKeys("Bangalore");
		WebElement search = driver.findElement(By.id("trainFormButton"));
		search.click();
	}
	
}