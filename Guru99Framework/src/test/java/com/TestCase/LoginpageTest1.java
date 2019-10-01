package com.TestCase;

import org.testng.annotations.Test;

public class LoginpageTest1 extends Base{
@Test
public void loginPageTest()
{
	driver.get(baseurl);
	System.out.println(driver.getTitle());
}
	
	
}
