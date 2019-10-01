package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
public static Properties loadPoperties(String filename) throws FileNotFoundException, IOException
{
	Properties prop=new Properties();
	prop.load(new FileInputStream(Constants.path+filename));
	
	return prop;
}
	
}
