package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.Capabilities;

public class HomePageTest extends Capabilities{
HomePage hm=new HomePage(driver);
@Test
public void searchLaptop() {
//	PageFactory.initElements(driver, hm);
	hm.searchLaptop();
}
}
