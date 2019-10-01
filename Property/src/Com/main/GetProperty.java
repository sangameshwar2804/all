package Com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {
	Properties pro;
public  GetProperty()throws IOException {
	Properties pro=new Properties();
	FileInputStream fp=new FileInputStream(System.getProperty("C:\\Users\\Training\\eclipse-workspace\\Property\\Configurations\\Config.properties"));
	pro.load(fp);
	
	
	
}
public String getUrl() {
	String url=pro.getProperty("BaseUrl");
	return url;
}
}
