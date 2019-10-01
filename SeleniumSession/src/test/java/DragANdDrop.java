import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement capital=driver.findElement(By.id("box1"));
	WebElement country=driver.findElement(By.id("box106"));
	WebElement capital1=driver.findElement(By.id("box3"));
	WebElement country1=driver.findElement(By.id("box103"));
	act.dragAndDrop(capital1, country1).build().perform();
	act.clickAndHold(capital).moveToElement(country).release().perform();
}
}
