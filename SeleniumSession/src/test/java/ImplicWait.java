import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicWait {
@Test
public void elementWait() {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.get("http://whiteboxqa.com/recordings.php");
	driver.findElement(By.id("username")).sendKeys("aryav");
	WebDriverWait wait=new WebDriverWait(driver, 2);
	WebElement password=driver.findElement(By.id("password"));
	wait.until(ExpectedConditions.visibilityOf(password));
	password.sendKeys("12345");
}
}
