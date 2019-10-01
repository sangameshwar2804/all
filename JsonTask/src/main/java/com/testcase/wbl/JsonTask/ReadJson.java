package com.testcase.wbl.JsonTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException 
	{
		Object obj= new JSONParser().parse(new FileReader("coordinates.json"));
		JSONArray jo = (JSONArray) obj;
    for(Object j:jo) {
    	System.out.println(j);
    }
	}
}
