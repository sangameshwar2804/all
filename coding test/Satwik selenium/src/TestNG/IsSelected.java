package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) {
	
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.findElement(By.cssSelector("#u_0_z ._5dba:nth-of-type(1) [type]")));
	//System.out.println(driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")));
	if(driver.findElement(By.cssSelector("#u_0_z ._5dba:nth-of-type(1) [type]")).isSelected()==false) {
		driver.findElement(By.cssSelector("#u_0_z ._5dba:nth-of-type(1) [type]")).click();
	}
	
}
}
