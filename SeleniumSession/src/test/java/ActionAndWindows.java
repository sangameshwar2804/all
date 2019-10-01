import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	WebElement switchlin=driver.findElement(By.cssSelector(".dropdown:nth-of-type(4) .dropdown-toggle"));
	WebElement windowButton=driver.findElement(By.xpath("//a[text()=\"Windows\"]"));
	Actions act=new Actions(driver);
	act.moveToElement(switchlin).perform();
	act.moveToElement(windowButton).click().build().perform();
	WebElement clickButton=driver.findElement(By.cssSelector("#Tabbed .btn-info"));
	clickButton.click();
	String child=driver.getWindowHandle();
	System.out.println(child);
	Set<String> window=driver.getWindowHandles();
	for(String name:window) {
		if(!name.equals(child))
			driver.switchTo().window(name);
		break;
	}
}
}
