package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.wbl.base.BaseTest;

import comwbl.pages.HomePage;

public class HomepageTest extends BaseTest {
HomePage hp;
	@Test
public void test1() {
		hp=new HomePage(driver);
		String title=hp.getTitle();
		System.out.println(title);
	}
}
