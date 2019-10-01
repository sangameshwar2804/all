package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItFileUpload {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriveri.chrome.driver", "C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/account/createaccount");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()=\"I am a Fresher\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"uploadCV\"]")).click();
	Runtime.getRuntime().exec("C:/autoitExe/fileupload.exe"+" "+"C:\\Users\\Training\\Desktop\\AutomationFramework.txt");
}
}
