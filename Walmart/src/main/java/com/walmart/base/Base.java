package com.walmart.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.walmart.utilities.WebdriverUtils;

public class Base {
protected WebDriver driver;
@BeforeClass
public void beforeClass() {
	driver=WebdriverUtils.getDriver("chrome");
	driver.get("https://www.walmart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterClass
public void afterClass() {
	driver.quit();
}
}
