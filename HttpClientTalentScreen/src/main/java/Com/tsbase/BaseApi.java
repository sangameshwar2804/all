package Com.tsbase;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import Com.ts.helper.ConfigUtils;
import Com.ts.helper.RestResponce;

public class BaseApi {
private String url;
RestResponce responce;
HttpClient httpClient;
public BaseApi(String url)
{
	url=this.url;
	httpClient=HttpClientBuilder.create().build();
	setAuthentication();
}
public void setAuthentication() {
	Properties pro=ConfigUtils.loadproperties("config.properties");
	
}
public RestResponce get(String resource) throws ClientProtocolException, IOException
{
	HttpGet get=new HttpGet(url+resource);
	responce=new RestResponce();
	
	HttpResponse res=httpClient.execute(get);
	responce.setStatuscode(res.getStatusLine().getStatusCode());
	responce.setStatusmessage(res.getStatusLine().toString());
	responce.setPayload(IOUtils.toString(res.getEntity().getContent()));
	return responce;
	
}
	
public RestResponce post(String resource) throws ClientProtocolException, IOException	
{
	HttpPost post=new HttpPost(url+resource);
	responce=new RestResponce();
	
	 post.setHeader("Content-Type","application/json");
	 HttpEntity entity=new StringEntity(createRequesstPayload());
	 post.setEntity(entity);
	HttpResponse response1=httpClient.execute(post);
	responce.setStatuscode(response1.getStatusLine().getStatusCode());
	responce.setStatusmessage(response1.getStatusLine().toString());
	responce.setPayload(IOUtils.toString(response1.getEntity().getContent()));
	return responce;

}
public String createRequesstPayload() {
	JSONObject json=new JSONObject();
	json.put("name", "ApiNew111");
	json.put("icon_class", "ts-seleniumwebdriver");
	
	return json.toString();
}

}
