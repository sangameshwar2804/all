package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.jayway.restassured.path.json.JsonPath;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
public class GetTes extends BaseTest{
@Test
public void getReq() {
	Response res=given().when().get("https://jsonplaceholder.typicode.com/users");
	System.out.println("StatusCode:-"+res.statusCode());
	System.out.println("ContentType:-"+res.contentType());
	System.out.println("Headers:-"+res.getHeaders());
	System.out.println("Body"+res.getBody().asString());
	System.out.println("Json Array"+res.jsonPath().get("company"));
	/*io.restassured.path.json.JsonPath jpath=res.jsonPath();
	ArrayList getLastName = (ArrayList) jpath.get("data");
	Object obj=getLastName.get(2);
	String jString =obj.toString();
	String onlyStr = jString.replaceAll("[{} ]", "");
	String[] splitedArr = onlyStr.split(",");
	String oneKeyValue = splitedArr[0];
	String[] splitedkeyValue = oneKeyValue.split("=");
	String result = splitedkeyValue[1];*/
io.restassured.path.json.JsonPath jpath=res.jsonPath();
ArrayList getName=(ArrayList)jpath.get("company");
Object obj=getName.get(1);
String jString=obj.toString();
String onlyString=jString.replaceAll("[{}]", "");
String[] splitedAr=onlyString.split(",");
String oneKeyValue=splitedAr[0];
String[] splitKeyVlue=oneKeyValue.split("=");
String result=splitKeyVlue[1];
System.out.println(result);
	
	//System.out.println(result);
}
}
