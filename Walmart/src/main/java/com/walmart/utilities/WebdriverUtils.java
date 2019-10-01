package com.walmart.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebdriverUtils {
	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		try {
			//factory design pattern
			if (browserName != null) {
				if (browserName == "chrome") {
					System.setProperty("webdriver.firefox.driver",
							System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browserName == "firefox") {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					
				}
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		return driver;

	}

}
