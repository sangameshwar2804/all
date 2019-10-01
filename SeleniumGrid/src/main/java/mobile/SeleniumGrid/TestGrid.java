package mobile.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGrid {
@Test
public void getBrowser() throws MalformedURLException
{
	DesiredCapabilities ds=new DesiredCapabilities();
	ds.setBrowserName("chrome");
	ds.setPlatform(Platform.WINDOWS);
	WebDriver driver=new RemoteWebDriver(new URL("http://10.136.3.120:48810/wd/hub"), ds);
	driver.get("http://whiteboxqa.com/");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
