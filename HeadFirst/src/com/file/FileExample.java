package com.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Training\\eclipse-workspace\\HeadFirst\\src\\com\\file\\text.txt");
	System.out.println("File Exists :"+f.exists());
	//f.createNewFile();
}
}
