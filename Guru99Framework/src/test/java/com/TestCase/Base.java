package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base {
public String username1="mngr186006";
public String pssword1="rupEgUm";
public String baseurl="http://demo.guru99.com/v4/index.php";
public static WebDriver driver;

@BeforeTest
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver.exe" );
	driver=new ChromeDriver();
	
}
@BeforeClass
public void teardown()
{
	driver.quit();
}
}
