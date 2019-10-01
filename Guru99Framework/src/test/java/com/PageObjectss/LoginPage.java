package com.PageObjectss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver diver) {
	this.driver=driver;
	}
@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
WebElement username_box;
@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
WebElement pssword_box;
@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
WebElement login_butoon;
public void userName(String userid)
{
	username_box.sendKeys(userid);
}
public void password(String passwordfield)
{
	pssword_box.sendKeys(passwordfield);
}
public void clickLogin()
{
	login_butoon.click();
}
}
