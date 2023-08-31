package com.salenium.practice.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://shop.demoqa.com/";

		/* Assignment 1 */

		
		  driver.get(URL); String pageTitle = driver.getTitle();
		  System.out.println("The Page title" + " " + pageTitle);
		  System.out.println("The length of the page title" + " " +
		  pageTitle.length()); String pageSource = driver.getPageSource(); //
		  System.out.println("The Page source" + " " + pageSource);
		  System.out.println("The Page source" + " " + pageSource.length());
		  Thread.sleep(6000); driver.close();
		 

		/* Assignment 2 */

		String Url2 = "https://demoqa.com/browser-windows/";
		driver.get(Url2);
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
