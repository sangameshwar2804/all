package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://mrbool.com/");
	Actions act=new Actions(driver);
	driver.findElement(By.xpath(""));
	
	driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"));
}
}
