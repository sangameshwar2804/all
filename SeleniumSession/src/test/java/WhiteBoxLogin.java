import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhiteBoxLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users/Training/AppData/Roaming/npm/node_modules/chromedriver/lib/chromedriver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://whiteboxqa.com/login.php");
driver.findElement(By.cssSelector("[placeholder='Enter your Username']")).sendKeys("training.wbl@gmail.com");
driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("Unlock.wbl");
driver.findElement(By.cssSelector("[method] [name='submit']")).click();
System.out.println(driver.getTitle());
}
}
