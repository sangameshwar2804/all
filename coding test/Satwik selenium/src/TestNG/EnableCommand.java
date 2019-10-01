package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableCommand {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
	WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	if(email.isDisplayed() && email.isEnabled()) {
		email.sendKeys("hello");
	}
}
}
