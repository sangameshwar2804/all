package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	protected RemoteWebDriver driver;
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="com.walmart.android:id/search_edit_frame")
WebElement searchBar;
@FindBy(id="com.walmart.android:id/nextday_switch_header_top\r\n" + 
		"")
WebElement laptop;
public void searchLaptop() {
	searchBar.sendKeys("laptop");
	laptop.click();
}
}
