package mobile.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homepage {
	
WebDriver driver;
@Test
public void test()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training\\Downloads\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("http://demo.guru99.com/v4/index.php");
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("hello");
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("hello");
driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
}
}
