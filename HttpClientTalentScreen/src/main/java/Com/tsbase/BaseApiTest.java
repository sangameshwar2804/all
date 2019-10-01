package Com.tsbase;

import java.util.Properties;

import javax.management.MXBean;

import org.testng.annotations.BeforeSuite;

import Com.ts.helper.ConfigUtils;

public class BaseApiTest {
	
protected String endpoint;
@BeforeSuite
public void beforeSuite()
{

	Properties prop=ConfigUtils.loadproperties("config.properties");
	endpoint=prop.getProperty(("Tsurl"));
	
}

}
