package com.salenium.practice;

import javax.sql.rowset.JdbcRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemySiteAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
 
	   
	}

}


