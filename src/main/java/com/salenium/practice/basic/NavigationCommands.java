package com.salenium.practice.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.toolsqa.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(200,-250)");
		driver.findElement(By.id("accept-cookie-policy")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']")).click();
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		driver.navigate().to(URL);
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.close();
	}

}
