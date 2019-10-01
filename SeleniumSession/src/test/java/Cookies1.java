import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies1 {
@Test
	public void cookiesTest() {
		System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://whiteboxqa.com/recordings.php");
		Set<Cookie> s=driver.manage().getCookies();
		System.out.println(s.size());
		/*for(Cookie c:s) {
			System.out.println(c.getName()+" "+c.getValue());
		}*/
		System.out.println(driver.manage().getCookieNamed("PHPSESSID"));
		driver.quit();
}
}
