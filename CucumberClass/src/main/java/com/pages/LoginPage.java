package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#Email")
	WebElement email;
	@FindBy(css = "[name='Password']")
	WebElement password;
	@FindBy(css = "[type='submit']")
	WebElement submitButton;

	public String dologin(String userName, String pwd) {
		email.sendKeys(userName);
		password.sendKeys(pwd);
		submitButton.click();
		return driver.getTitle();
	}
}
