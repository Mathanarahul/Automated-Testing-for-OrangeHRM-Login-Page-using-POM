package com.project.orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMLoginPageTest {
	
	@Test
	public void loginPageTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUBHASHADHA\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.quit();
	}
	@Test
	public void validLoginPageTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SUBHASHADHA\\Desktop\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		OrangeHRMLoginPage or=new OrangeHRMLoginPage(driver);
		or.getOrangeHRMUserName().sendKeys("Admin");
		Thread.sleep(2000);
		or.getOrangeHRMPassword().sendKeys("admin123");
		Thread.sleep(4000);
		or.getOrangeHRMLoginButton().click();
	}

	

}
