package com.wbl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Commonpage {
protected WebDriver driver;
public Commonpage(WebDriver driver) {
	driver=this.driver;
}
public String getHeader() {
	WebElement link=driver.findElement(By.xpath("//a[text()=\"925-400-7330\"]"));
	return driver.getTitle();
}
}
