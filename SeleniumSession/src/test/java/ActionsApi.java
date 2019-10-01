import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsApi {
	WebDriver driver;
	@BeforeTest
		public void beforeTest() {
		System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().window().maximize();
	}
	

	public void onMouseOver() throws InterruptedException {
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		System.out.println(driver.getTitle());
		WebElement alexa_Eccho=driver.findElement(By.cssSelector("[tabindex='15']"));
		Actions act=new Actions(driver);
		act.moveToElement(alexa_Eccho).perform();
		WebElement fireStick=driver.findElement(By.cssSelector("[data-nav-panelkey='FireTVPanel'] .nav-text"));
		fireStick.click();
		String actual=driver.getTitle();
		System.out.println(actual);
		//assertEquals(actual, "Amazon Assistant");
		Thread.sleep(200);
		
	}
	@Test
	public void clickAction() {
		driver.findElement(By.cssSelector("[name='field-keywords']")).sendKeys("lapto");
	}
	@AfterTest
	public void aftreTest() {
		driver.close();
	}
}
