package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroolldown {
public static void main(String[] args) {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_CjwKCAjwlPTmBRBoEiwAHqpvhb7RduixlaOz5VIvJ7Im2OU838rX3GpLDASo9Z7jynaTFBRfEVk6AhoCQdgQAvD_BwE_k_&gclid=CjwKCAjwlPTmBRBoEiwAHqpvhb7RduixlaOz5VIvJ7Im2OU838rX3GpLDASo9Z7jynaTFBRfEVk6AhoCQdgQAvD_BwE");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
	//WebElement bat=driver.findElement(By.xpath("//*[@id=\"GTDBNLs5Iozt7ojW1vitCA\"]/div[2]/div/ul/li[1]/span[1]/a/img"));
	//js.executeScript("arguments[0].scrollIntoView()", bat);
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
