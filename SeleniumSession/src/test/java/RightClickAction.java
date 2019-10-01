import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act=new Actions(driver);
	WebElement rightClick=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	act.contextClick(rightClick).build().perform();
	driver.findElement(By.xpath("//span[text()=\"Edit\"]")).click();
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	driver.close();
	}
}
