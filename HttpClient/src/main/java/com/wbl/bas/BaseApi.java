package com.wbl.bas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import com.wbl.helper.ConfigUtils;
import com.wbl.helper.RestResponce1;
public class BaseApi {
private String url;
RestResponce1 responce;
HttpClient httpClient;
public BaseApi(String url) throws FileNotFoundException, IOException
{
	this.url=url;
httpClient =HttpClientBuilder.create().build();
setAuthenticatio();
}
public void setAuthenticatio() throws FileNotFoundException, IOException  {
	Properties prop=ConfigUtils.loadPoperties("config.properties");
}
public RestResponce1 get(String resource) throws ClientProtocolException, IOException
{
	HttpGet get=new HttpGet(url+resource);
	 responce=new RestResponce1();
	HttpResponse response1=httpClient.execute(get);
	responce.setStatuscode(response1.getStatusLine().getStatusCode());
	responce.setStatusmessages(response1.getStatusLine().toString());
	responce.setPayload(IOUtils.toString(response1.getEntity().getContent()));
	return responce;

	
}
public RestResponce1 post(String resource) throws ClientProtocolException, IOException
{
	HttpPost post=new HttpPost(url+resource);
	 responce=new RestResponce1();
	 post.setHeader("Content-Type","application/json");
	 HttpEntity entity=new StringEntity(createRequesstPayload());
	 post.setEntity(entity);
	HttpResponse response1=httpClient.execute(post);
	responce.setStatuscode(response1.getStatusLine().getStatusCode());
	responce.setStatusmessages(response1.getStatusLine().toString());
	responce.setPayload(IOUtils.toString(response1.getEntity().getContent()));
	return responce;

	
}
private String createRequesstPayload() {
	//String reqpayload= "{ \"name\": \"Selenium WebDriver1.141.59\",\"icon_class\": \"ts-seleniumwebdriver\"}";
	JSONObject json=new JSONObject();
	json.put("name", "ApiNew111");
	json.put("icon_class", "ts-seleniumwebdriver");
	
	return json.toString();
}
	
}
