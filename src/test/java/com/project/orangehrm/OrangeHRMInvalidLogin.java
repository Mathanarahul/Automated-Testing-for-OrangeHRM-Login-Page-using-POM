package com.project.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMInvalidLogin {
	
	@AfterTest
	public void invalidLogin()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUBHASHADHA\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		OrangeHRMLoginPage or=new OrangeHRMLoginPage(driver);
		or.getOrangeHRMUserName().sendKeys("xxx");
		Thread.sleep(2000);
		or.getOrangeHRMPassword().sendKeys("123");
		Thread.sleep(4000);
		or.getOrangeHRMLoginButton().click();
		
	}
	@AfterTest
	public void validPassword()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUBHASHADHA\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		OrangeHRMLoginPage or=new OrangeHRMLoginPage(driver);
		or.getOrangeHRMUserName().sendKeys("xxx");
		Thread.sleep(2000);
		or.getOrangeHRMPassword().sendKeys("admin123");
		Thread.sleep(4000);
		or.getOrangeHRMLoginButton().click();
	}
	@BeforeTest
	public void validUserName()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUBHASHADHA\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		OrangeHRMLoginPage or=new OrangeHRMLoginPage(driver);
		or.getOrangeHRMUserName().sendKeys("Admin");
		Thread.sleep(2000);
		or.getOrangeHRMPassword().sendKeys("123");
		Thread.sleep(4000);
		or.getOrangeHRMLoginButton().click();
		Thread.sleep(6000);
	}
	
}
