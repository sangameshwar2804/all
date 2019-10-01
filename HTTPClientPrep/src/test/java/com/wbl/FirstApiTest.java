package com.wbl;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstApiTest {
	String baseUrl = "https://reqres.in/api/users?page=2";

	@Test
	public void getTest() throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet get = new HttpGet(baseUrl);
		//adding headers
		get.addHeader("companygatwayid","123456");
		HttpResponse responce = client.execute(get);
		System.out.println("Responce Status Code:" + responce.getStatusLine().getStatusCode());
		System.out.println("Response Message:" + responce.getStatusLine());
		String responseString = IOUtils.toString(responce.getEntity().getContent(), "UTF-8");
		assertEquals(responce.getStatusLine().getStatusCode(), 200);
        //Headers
		Header[] header = responce.getAllHeaders();
		for (int i = 0; i < header.length; i++) {
			System.out.println("header Name:" + header[i].getName() + "header value:" + header[i].getValue());
		}
		System.out.println(responseString);
		//Parsin Responce
		JSONObject obj = new JSONObject(responseString);
		JSONArray arr = obj.getJSONArray("data");
		for (int i = 0; i < arr.length(); i++) {
			obj = arr.getJSONObject(i);
			Assert.assertNotNull(obj.get("id"));
			Assert.assertTrue(obj.has("email"));
		}
		// Assert.assertEquals(4, obj.get("total_pages"));
	}
}
