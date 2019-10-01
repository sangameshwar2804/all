import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElements {
@Test
public void getElementOf() {
	WebDriver driver;
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	WebElement elemet=driver.findElement(By.id("username"));
	System.out.println(elemet.getCssValue("border-raidus"));
	System.out.println(elemet.getCssValue("font-size"));
	Assert.assertTrue(elemet.isDisplayed());
}
}
