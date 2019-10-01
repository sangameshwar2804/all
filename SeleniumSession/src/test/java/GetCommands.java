import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
driver.get("http://whiteboxqa.com/recordings.php#");
System.out.println(driver.getTitle());
}
}
