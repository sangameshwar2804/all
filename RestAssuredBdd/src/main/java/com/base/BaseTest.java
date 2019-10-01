package com.base;

import javax.management.MXBean;

import org.testng.annotations.BeforeSuite;

import com.helper.ConfigUtils;
import com.helper.Constaants;

public class BaseTest {
protected String endPoint;
@BeforeSuite
public void beforeSuite(){
	ConfigUtils utils=new ConfigUtils(Constaants.Resources_Path+"config.properties");
	endPoint=utils.getKey("baseurl");
}
}
