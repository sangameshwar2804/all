import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropAction {
	WebDriver driver;
	@BeforeTest
		public void beforeTest() {
		System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().window().maximize();
	}
	@Test
	public void doDragAndDrop() throws InterruptedException {
		driver.get("https://code.makery.ch/library/dart-drag-and-drop/");
		WebElement frame=driver.findElement(By.xpath("//div/iframe[2]"));
		driver.switchTo().frame(frame);
		List<WebElement> elements1=driver.findElements(By.cssSelector(".document"));
		System.out.println("size of elements before performing action :"+elements1.size());
		Actions act=new  Actions(driver);
		WebElement imeage=driver.findElement(By.cssSelector(".container .document:nth-child(3)"));
	WebElement dropArea=driver.findElement(By.xpath("//div[@class=\"trash\"]"));
	//act.dragAndDrop(imeage, dropArea).perform();;
	act.clickAndHold(imeage).moveToElement(dropArea).release(dropArea).build().perform();
	List<WebElement> elements=driver.findElements(By.cssSelector(".document"));
	System.out.println("size of elements aftre performing action :"+elements.size());
	Thread.sleep(200);
	}
}
