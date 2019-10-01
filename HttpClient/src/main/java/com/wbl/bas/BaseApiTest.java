package com.wbl.bas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.wbl.helper.ConfigUtils;

public class BaseApiTest {

	protected String endpoint;
	@BeforeSuite
	public void beforeSuite() throws FileNotFoundException, IOException
	{
		Properties pro=ConfigUtils.loadPoperties("config.propeties");
		endpoint=pro.getProperty("Tsurl");
	}
	
}
