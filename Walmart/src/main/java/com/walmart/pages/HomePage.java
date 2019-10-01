package com.walmart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.walmart.base.CommonPage;

public class HomePage extends CommonPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	public String serach(String data)
	{
	driver.findElement(By.xpath("//*[@id=\"global-search-input\"]")).sendKeys(data);
	driver.findElement(By.xpath("//*[@id=\"global-search-submit\"]/span/span")).click();
	return driver.getTitle();
		
	}
	public int navigationLinks() {
		return driver.findElements(By.className("zhEWD a3FfKb")).size();
	}
	public int footerLinks()
	{
		return driver.findElements(By.className("a1qZfv a3zIHx")).size();
	}
}
