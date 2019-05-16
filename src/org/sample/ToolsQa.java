package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\eclipse-workspace\\Thiyagu\\selenium\\Day3\\SeleniumDay3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		WebElement fName=driver.findElement(By.name("firstname"));
		fName.sendKeys("Thiyagarajan");
		WebElement lName=driver.findElement(By.name("lastname"));
		lName.sendKeys("Parthiban");
		WebElement sex=driver.findElement(By.id("sex-0"));
		sex.click();
		WebElement experience=driver.findElement(By.id("exp-2"));
		experience.click();
		WebElement date=driver.findElement(By.id("datepicker"));
		date.sendKeys("16/08/2019");
		WebElement profession1=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		profession1.click();
		WebElement profession2=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		profession2.click();
		WebElement tool1=driver.findElement(By.id("tool-1"));
		tool1.click();
		WebElement too12=driver.findElement(By.id("tool-2"));
		tool1.click();
	}
}

