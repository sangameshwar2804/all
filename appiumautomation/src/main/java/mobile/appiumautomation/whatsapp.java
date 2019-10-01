package mobile.appiumautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class whatsapp {
@Test
public void app() throws MalformedURLException
{

	DesiredCapabilities capability=new DesiredCapabilities();
	capability.setCapability("platformVersion" ,"7.0" );
	capability.setCapability("deviceName", "5554");
	capability.setCapability("platformName", "Android");
	capability.setCapability("appPackage", "com.whatsapp");
	capability.setCapability("app-activity", "com.whatsapp.registration.EULA");	
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http:0.0.0.0:4723/wd/hub"),capability);
WebElement el = driver.findElement(By.id("com.whatsapp:id/eula_accept\r\n" + 
		""));
el.click();
} 
}
