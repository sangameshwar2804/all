package mobile.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {
	final static String UserName="aryavip1";
	final static String AccessKey="tykJCW5MeNosDvjMZHxv";
	final static String Url="https://"+UserName+":"+AccessKey+"@hub.browserstack.com/wd/hub";
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities ds=DesiredCapabilities.chrome();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
		ds.setVersion("57");
		WebDriver driver=new RemoteWebDriver(new URL(Url),ds);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
