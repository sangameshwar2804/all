package com.wbl.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.wbl.utils.CnfigUtils;
import com.wbl.utils.Constants;
import com.wbl.utils.WebDriverUtils;

public class BaseTest {
	protected WebDriver driver;
	protected String url;
	protected String browser;
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws FileNotFoundException, IOException {
		CnfigUtils config = new CnfigUtils(Constants.Resources_path + "config.properties");
		url = config.getProperty("url");
		browser = config.getProperty("browser");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		System.out.println("Test Execution starts");
		driver = WebDriverUtils.getDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();
	}
@AfterSuite
public void afterSuite() {
	driver.close();
}
}
