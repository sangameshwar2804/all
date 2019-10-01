import java.util.HashSet;  
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-switch-windows/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.xpath("//button[text()=\"New Browser Window\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", e1);
WebElement e2=driver.findElement(By.xpath("//button[text()=\"New Browser Tab\"]"));
js.executeScript("arguments[0].click()",e2);
String parent=driver.getWindowHandle();
Set<String> s=new HashSet<String>();
for(String child:s) {
	System.out.println(child);
}
}
}
