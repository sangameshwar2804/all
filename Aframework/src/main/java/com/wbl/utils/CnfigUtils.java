package com.wbl.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CnfigUtils {
	public static final Properties pro = new Properties();
	

	public CnfigUtils(String fileName) {
		try {
			pro.load(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return pro.getProperty(key);
	}
}
