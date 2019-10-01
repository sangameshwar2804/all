import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandels {
WebDriver driver;
@Test
public void swithchingToChildWindow() throws InterruptedException {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://whiteboxqa.com/login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("loginbyfb")).click();
	String parentWindow=driver.getWindowHandle();
	Set<String> windows=driver.getWindowHandles();
	for(String name:windows) {
		System.out.println("name of the windows"+name);
		if(!name.equals(parentWindow)) {
			driver.switchTo().window(name);
			break;
		}
	}
	System.out.println(driver.getTitle());
	driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.id("pass")).sendKeys("psaaaword");
	driver.findElement(By.id("u_0_0")).sendKeys(Keys.ENTER);
	Thread.sleep(200);
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	//driver.quit();
}
}
