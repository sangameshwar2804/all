package com.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
public static final	Properties pro=new Properties();
public ConfigUtils(String fileName) {
	try {
		pro.load(new FileInputStream(fileName));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		public String getKey(String key) {
			return pro.getProperty(key);
		}
}
