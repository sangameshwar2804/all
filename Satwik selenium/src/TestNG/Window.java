package TestNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    // Launch the URL

    driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");

    // Store and Print the name of the First window on the console

    String handle= driver.getWindowHandle();

    System.out.println(handle);

    // Click on the Button "New Message Window"

    driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();

    // Store and Print the name of all the windows open	              

    Set<String> handles = driver.getWindowHandles();

    System.out.println(handles);

    // Pass a window handle to the other window

    for (String handle1 : driver.getWindowHandles()) {
    	System.out.println(driver.getTitle());

    	System.out.println(handle1);

    	driver.switchTo().window(handle1);

    	}
}
}
