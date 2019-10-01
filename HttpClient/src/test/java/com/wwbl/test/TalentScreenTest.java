package com.wwbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.bas.BaseApi;
import com.wbl.bas.BaseApiTest;
import com.wbl.helper.RestResponce1;

public class TalentScreenTest extends BaseApiTest{
BaseApi api;
	@BeforeClass
private void beforeClass() throws FileNotFoundException, IOException {
	api=new BaseApi(endpoint);	
}
	@Test
	public void getSubjectsTest() throws ClientProtocolException, IOException
	{
		RestResponce1 responce=api.get("/subjects");
		System.out.println(responce.getStatuscode());
		System.out.println(responce.getStatusmessages());
		assertEquals(responce.getStatuscode(),200);
		assertTrue(responce.getStatusmessages().contains("sucess"));
		JSONArray json=new JSONArray(responce.getPayload());
		json.toString();
		System.out.println(json.toString());
		System.out.println("id"+((JSONObject) json.get(0)).get("id"));
	}
	@Test
	public void postSubjectsTest() throws ClientProtocolException, IOException
	{
		RestResponce1 responce=api.get("/subjects");
		assertEquals(responce.getStatuscode(),201);
		assertTrue(responce.getStatusmessages().contains("created"));
		JSONObject json=new JSONObject(responce.getPayload());
		System.out.println(json.toString());
System.out.println("id"+json.getString("id"));
	}
	@Test
	public void putSubjectsTest() throws ClientProtocolException, IOException
	{
		RestResponce1 responce=api.
	
		assertTrue(responce.getStatusmessages().contains("ok"));
		JSONObject json=new JSONObject(responce.getPayload());
		System.out.println(json.toString());
System.out.println("name"+json.getJSONArray("name"));
assertNotNull(json.getJSONArray("name"));
	}
	@Test
	public void deleteSubjectsTest() throws ClientProtocolException, IOException
	{
		RestResponce1 responce=api.get("/subjects");
		assertEquals(responce.getStatuscode(),200);
		assertTrue(responce.getStatusmessages().contains("nocontent"));
		JSONObject json=new JSONObject(responce.getPayload());
		System.out.println(json.toString());
System.out.println("name"+json.getJSONArray("name"));
assertNotNull(json.getJSONArray("name"));
	}
}
