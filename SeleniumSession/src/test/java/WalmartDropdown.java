import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WalmartDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=laptop&ref=nb_sb_noss_2");
	System.out.println(driver.getTitle());
	
driver.quit();
}
}
