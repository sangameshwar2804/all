package tassk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
@Test
public void tabletest()
{
	System.setProperty("webdriveer.chromee.driver", "C:/Users/Training/Download/Microsoft.SkypeApp_kzf8qxf38zg5c!App/AllWebApiAutomation/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	int tablerow=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();//no of rows in table
	
	System.out.println(tablerow);
	int table_heading=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th")).size();//no of table heaings available
	System.out.println(table_heading);
	for(int i=2;i<=tablerow;i++)
	{
		for(int j=1;j<=table_heading;j++)
		{

			System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");//printing table data
		}
		System.out.println();
	}
driver.close();	
}
}
