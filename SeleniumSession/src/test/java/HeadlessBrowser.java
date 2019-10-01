import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.reporters.jq.Main;

public class HeadlessBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
ChromeOptions options=new ChromeOptions();
//options.setHeadless(true);
options.addArguments("--headless");
WebDriver driver=new ChromeDriver(options);
driver.get("http://whiteboxqa.com/recordings.php");
System.out.println("title of the page is"+driver.getTitle());
}
}
