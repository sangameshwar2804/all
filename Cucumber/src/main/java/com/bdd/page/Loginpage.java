package com.bdd.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.PageObject;

public class Loginpage extends PageObject{
public Loginpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
@FindBy(css="#Email")
WebElement email;
@FindBy(css="[name='Password']")
WebElement password;
@FindBy(css="[type='submit']")
WebElement submitButton;
public String loginWithValid(String userName,String userPassword) {
	email.sendKeys(userName);
		password.sendKeys(userPassword);
	submitButton.click();
	return driver.getTitle();
}
}
