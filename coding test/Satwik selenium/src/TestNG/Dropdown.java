package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
	WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
	WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select daypicker=new Select(day);
	Select montpicker=new Select(month);
	Select yearpick=new Select(year);
	daypicker.selectByIndex(2);
	montpicker.selectByIndex(3);
	yearpick.selectByIndex(3);

}
}
