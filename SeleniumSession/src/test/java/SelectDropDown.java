import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
WebElement day=driver.findElement(By.xpath("//select[@id=\"day\" and @name=\"birthday_day\"]"));
WebElement month=driver.findElement(By.xpath("//select[@id=\"month\" and @name=\"birthday_month\"]"));
WebElement year=driver.findElement(By.xpath("//select[@id=\"year\" and @name=\"birthday_year\"]"));
Select dayDropDown=new Select(day);
Select monthDropDown=new Select(month);
Select yearDropDown=new Select(year);
dayDropDown.selectByIndex(0);
monthDropDown.selectByValue("4");
yearDropDown.selectByVisibleText("1995");
}
}
