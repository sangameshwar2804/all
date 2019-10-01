package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement firstName=driver.findElement(By.name("firstname"));
	WebElement surName=driver.findElement(By.name("lastname"));
	sendKeys(driver, firstName, 20, "whitebox");
	sendKeys(driver, surName, 5, "talentscren");
}
public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value ) {
	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
}
}
