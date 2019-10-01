package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigUtils {
public static Properties loadProperties(String filename)
{
	Properties pro=new Properties();
	try {
		pro.load(new FileInputStream(Constants.path+filename));
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return pro;
}
}
