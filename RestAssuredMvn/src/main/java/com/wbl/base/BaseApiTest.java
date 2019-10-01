package com.wbl.base;

import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.wbl.helper.ConfigUtils;

public class BaseApiTest {
	protected String endpoint;
@BeforeSuite
public void beforeSuite()
{
	Properties pro=ConfigUtils.loadProperties("config.properties");
	endpoint=pro.getProperty("TSurl");
}
}
