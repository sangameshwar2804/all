package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {
	Properties property;
	FileInputStream fs;

	public String getProValue(String key) throws FileNotFoundException {
		fs = new FileInputStream(System.getProperty("user.dir") + "/config/data.properties");
		property = new Properties();
		String result = property.getProperty(key);
		return result;
	}

	public String getPageObjects(String key) throws IOException {
		fs = new FileInputStream(System.getProperty("user.dir") + "/config/pageObjects.properties");
		property = new Properties();
		property.load(fs);
		String result = property.getProperty(key);
		return key;
	}
}
