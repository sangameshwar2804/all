package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Training\\eclipse-workspace\\HeadFirst\\src\\com\\file\\writetext.txt");
	System.out.println(f.createNewFile());
	FileWriter fw=new FileWriter(f);
	fw.write("hey this is aryav from whitebox learning");
	fw.write("\n Qa Instructor");
	fw.write("\n today our class is on java");
	fw.write("at 9 AM");
	fw.flush();
	fw.close();

}
}
