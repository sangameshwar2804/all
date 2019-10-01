package Com.ts.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.ts.helper.RestResponce;
import Com.tsbase.BaseApi;
import Com.tsbase.BaseApiTest;

public class TalentScreenTest extends BaseApiTest{
	BaseApi api;
    int id ;
	@BeforeClass
	private void beforeClass() {
		api = new BaseApi(endpoint);

	}

	@Test(enabled=true)
	public void getSubjectsTest() throws ClientProtocolException, IOException {
		RestResponce response = api.get("/api/users?page=2");
		System.out.println(response.getStatuscode());
		assertEquals(response.getStatuscode(), 200);
		System.out.println(response.getStatusmessage());
		assertTrue(response.getStatusmessage().contains("HTTP/1.1 200 OK"));
		JSONArray json = new JSONArray(response.getPayload());
		System.out.println(json.toString());
		System.out.println("id:"+((JSONObject)json.get(0)).get("id"));

	}

	@Test(enabled=true)
	public void postSubjectsTest() throws ClientProtocolException, IOException {
		RestResponce response = api.post("/api/users?page=2");
		// getting important header info from response
		// assert for status code
		assertEquals(response.getStatuscode(), 201);
		// assert for status message
		assertTrue(response.getStatusmessage().contains("Created"));
		// getting actual body(resposne payload)
		// parsing json object
		JSONObject json = new JSONObject(response.getPayload());
		System.out.println(json.toString());
        id=  ((Integer) json.get("id")).intValue();
		System.out.println("id:" + id);

	}
	/*@Test(enabled=true, dependsOnMethods="postSubjectsTest")
	public void updateSubjectsTest() {
		RestResponce response = api.update("/subjects","/"+id+"/?authentication=false");
		// getting important header info from response
		// assert for status code
		assertEquals(response.getStatuscode(), 200);
		// assert for status message
		assertTrue(response.getStatusmessage().contains("OK"));
		// getting actual body(resposne payload)
		// parsing json object
		JSONObject json = new JSONObject(response.getPayload());
		System.out.println(json.toString());
		System.out.println("name:" + json.get("name"));
	    assertNotNull(json.get("name"));

	}
	@Test(enabled=true, dependsOnMethods="postSubjectsTest")
	public void deleteSubjectsTest() {
		RestResponse response = api.delete("/subjects","/"+id+"/?authentication=false");
		// getting important header info from response
		// assert for status code
		assertEquals(response.getStatuscode(), 204);
		// assert for status message
		assertTrue(response.getStatusMessage().contains("No Content"));
		

	}*/
}
