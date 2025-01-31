package com.project.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMLoginPage {
	
	WebDriver driver;
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	By OrangeHRMUserName=By.xpath("//input[@name='username']");
	By OrangeHRMPassword=By.xpath("//input[@name='password']");
	By OrangeHRMLoginButton=By.xpath("//button[@type='submit']");
	
	public WebElement getOrangeHRMUserName(){
		return driver.findElement(OrangeHRMUserName);	
	}
	public WebElement getOrangeHRMPassword() {
		return driver.findElement(OrangeHRMPassword);	
		
	}
	public WebElement getOrangeHRMLoginButton() {
		return driver.findElement(OrangeHRMLoginButton);
		
	}
	
 

}
