package com.walmart.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.walmart.base.Base;
import com.walmart.pages.HomePage;

public class HomePageTest extends Base {
	HomePage hm = new HomePage(driver);

	@Test
	public void searchTest() {
	//	String actual=hm.serach("Laptop");
		System.out.println(hm.serach("laptop"));;

	}
}
