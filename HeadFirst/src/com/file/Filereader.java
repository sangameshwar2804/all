package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) {
		File f=new File("writetext.txt");
		FileWriter fw;
		try {
			fw=new FileWriter(f);
			fw.flush();
			fw.close();
			FileReader fr=new FileReader(f);
			char[] ch=new char[5];
			fr.read(ch);
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]);
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
