package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferrederExample {
public static void main(String[] args) throws IOException {
	
	FileReader fr=new FileReader("sample.txt");
	BufferedReader br=new BufferedReader(fr);
System.out.println(br.readLine());
br.close();
}
}
