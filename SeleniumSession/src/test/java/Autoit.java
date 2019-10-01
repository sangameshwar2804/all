import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoit {
	@Test
	public void fileUpload() throws IOException {
		System.setProperty("webdriver.chrome.diver",
				"C:/Users/Training/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/WebApiAutomation/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).click();
		//driver.findElement(By.xpath("//input[@name=\"uploadCV\"]")).click();
		Runtime.getRuntime()
				.exec("C:/autoitExe/fileupload.exe" + " " +"C:\\Users\\Training\\Documents\\Attar_updated resume.docx");
	}
}