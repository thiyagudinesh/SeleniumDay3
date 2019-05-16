package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\eclipse-workspace\\Thiyagu\\selenium\\Day3\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement msecrse = driver.findElement(By.xpath("//a[@href='courses.html']"));
		Actions acc = new Actions(driver);
		acc.moveToElement(msecrse).perform();
		Thread.sleep(2000);
		WebElement mseorcle = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/oracle-training.html'][1]"));
		acc.moveToElement(mseorcle).perform();
		Thread.sleep(2000);
	}

}
