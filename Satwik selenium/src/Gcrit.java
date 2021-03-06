import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gcrit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		//Trying for some attributes
		String elementType= driver.findElement(By.linkText("Gmail")).getAttribute("value");
		System.out.println(elementType);

		//Click
		driver.findElement(By.linkText("Gmail")).click();
		

		driver.get("http://www.gcrit.com/build3/create_account.php");

		WebElement maleRadioButton = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")); 
		System.out.println(maleRadioButton.isDisplayed());//True
		System.out.println(maleRadioButton.isEnabled());//True
		System.out.println(maleRadioButton.isSelected());//False
		Thread.sleep(2000);
		maleRadioButton.click();
		System.out.println(maleRadioButton.isSelected());//True
		WebElement femaleRadioButton= driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));
		femaleRadioButton.click();
		System.out.println(femaleRadioButton.isSelected());//True
		Thread.sleep(2000);
		
		driver.get("http://www.google.co.in");
		String imageTitle=driver.findElement(By.id("hplogo")).getAttribute("alt");
		System.out.println(imageTitle); //Google
		
		driver.get("http://newtours.demoaut.com/");
		WebElement imageButton=driver.findElement(By.name("login"));

		System.out.println(imageButton.isDisplayed()); //True
		System.out.println(imageButton.isEnabled()); //True
		imageButton.click(); 
		
		driver.get("https://www.seleniumhq.org/");
		WebElement imageLink=driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img"));

		System.out.println(imageLink.isDisplayed()); //True
		System.out.println(imageLink.isEnabled()); //True
		imageLink.click(); 
		
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		driver.switchTo().frame(2); 

		driver.findElement(By.linkText("org.openqa.selenium")).click();


		
		
		
		driver.close();
		 
	}
	
}
