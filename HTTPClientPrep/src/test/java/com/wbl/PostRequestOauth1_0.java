package com.wbl;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.testng.annotations.Test;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class PostRequestOauth1_0 {
	String baseUrl = "https://reqres.in/api/users";

	@Test
	public void postRequest() throws ClientProtocolException, IOException, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
		HttpClient client = HttpClientBuilder.create().build();
		//set authentiation
	//OAuthConsumer consumer=new CommonsHttpOAuthConsumer("", "");
	//consumer.setTokenWithSecret("", "");
	
		HttpPost post = new HttpPost(baseUrl);
		//authenticating the post request
		//consumer.sign(post);
		post.addHeader("headerreq", "2804");
		post.setEntity(null);
		//method 1
		/*ArrayList<NameValuePair> formparams = new ArrayList <NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "Apitest"));
		formparams.add(new BasicNameValuePair("description", "HttpClient"));
		post.setEntity(new UrlEncodedFormEntity(formparams));
*/
		JSONObject obj=new JSONObject();
		obj.put("name", "apitest");
		obj.put("description", "HttpClient");
		String req=obj.toString();
		System.out.println(req);
		post.setEntity(new StringEntity(req));
		HttpResponse responce = client.execute(post);

	}
}
