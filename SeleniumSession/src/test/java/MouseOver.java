import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.diver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	WebElement adminLink=driver.findElement(By.xpath("//b[text()=\"Admin\"]"));
	WebElement userManagement=driver.findElement(By.id("menu_admin_UserManagement"));
	WebElement user=driver.findElement(By.id("menu_admin_viewSystemUsers"));
	System.out.println(driver.getCurrentUrl());
	Actions act=new Actions(driver);
	act.moveToElement(adminLink).perform();
	act.moveToElement(userManagement).perform();
	act.moveToElement(user).click().perform();;
	System.out.println(driver.getCurrentUrl());
}
}
