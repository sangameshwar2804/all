package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.helper.ConfigUtils;
import com.wbl.helper.Constants;
import com.wbl.helper.WebDriverUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
public static WebDriver driver;
public static String browser;
public static String url;
static {
	
	ConfigUtils config=new ConfigUtils(Constants.Config_Path);
	browser=config.getKey("browser");//chrome
	url=config.getKey("url");//url
}
@Before
public void after() {
	System.out.println("before method");
	driver=WebDriverUtils.getDriver(browser);
	driver.get(url);
	driver.manage().window().maximize();
}
@After
public void before() {
	System.out.println("after method");
	driver.quit();
	
}

}
