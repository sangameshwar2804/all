import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoCommerce {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Training/AppData/Roaming/npm/node_modules/chromedriver/lib/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.findElement(By.cssSelector("#Email")).sendKeys("admin@yourstore.com");
	driver.findElement(By.cssSelector("[name='Password']")).sendKeys("admin");
	driver.findElement(By.cssSelector("[type='submit']")).click();
}
}
