package mobile.appiumautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Walmart {
@Test
public void launchWalmart() throws MalformedURLException {
	File app=new File("C:/Users/Training/Downloads/Walmart_v19.32.1_apkpure.com.apk");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("platformVersion","9");
	cap.setCapability("deviceName", "emulator-5554");
	cap.setCapability("browser","Chrome");
	cap.setCapability("platformName", "Android");
	cap.setCapability("app", app.getAbsolutePath());
	cap.setCapability("app-package", "com.walmart.android");
	cap.setCapability("app-activity","com.walmart.android.app.main.HomeActivity");
	RemoteWebDriver driver=new AndroidDriver(new URL("http:0.0.0.0:4723/wd/hub"),cap);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout")).sendKeys("laptop");
	/*WebElement cl=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout"));
	Actions act=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	act.moveToElement(cl);
	act.click();
	act.perform();*/
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout")).sendKeys(Keys.ENTER);
	System.out.println(driver.getTitle());
}
}
