import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	Actions act=new Actions(driver);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	driver.switchTo().frame(frame);
	WebElement sliderBar=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
	act.moveToElement(sliderBar).dragAndDropBy(sliderBar, 300, 0).build().perform();
}
}
