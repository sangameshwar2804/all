import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlHeadless {
public static void main(String[] args) {
	WebDriver driver=new HtmlUnitDriver();
	driver.get("http://whiteboxqa.com/recordings.php#");
	System.out.println(driver.getTitle());
}
}
