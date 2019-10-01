import org.apache.poi.sl.usermodel.ObjectMetaData.Application;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class GetReq {
@Test
public void test1() {
	//RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	
	//RequestSpecification httprequest=RestAssured.given();
	//Response res=httprequest.request(Method.GET,"/Hyderabad");
//String response=	res.getBody().asString();
//System.out.println(response);
	String baseurl="http://restapi.demoqa.com/utilities/weather/city/Hyderabad";

int statuscode=given().when().get(baseurl).statusCode();
System.out.println(statuscode);
String responce=given().when().get(baseurl).asString();
System.out.println(responce);
System.out.println(given().when().get(baseurl).then().assertThat().contentType(ContentType.JSON));
//given().when().get(baseurl).body("lotto.winners.winnerId", hasItems(23, 54));

//System.out.println(given().when().get(baseurl).then().body("Temperature", equalTo("34.03 Degree celsius")));
//System.out.println(given().when().get(baseurl).then().body("WindSpeed",is("1.5 Km per hour")));
String status=given().when().get(baseurl).getStatusLine();
int statuscode1=given().when().get(baseurl).getStatusCode();
System.out.println(status);
System.out.println(given().when().get(baseurl).then().log().all());
System.out.println(statuscode1);
Assert.assertEquals(status, "HTTP/1.1 200 OK");
Assert.assertEquals(statuscode1, statuscode1);
}
@Test
public void postTest() {
RestAssured.baseURI="https://reqres.in/api/users";
RequestSpecification spec=io.restassured.RestAssured.given();
JSONObject json=new JSONObject();
json.put("FirstName","john");
json.put("LastName","david");
json.put("UserName","johndavid");
json.put("Password","123456");
json.put("Email","john@wbl.com");
spec.header("Content-Type","application/json");
spec.body(json.toJSONString());
Response res=spec.request(Method.POST);
String resbody=res.getBody().asString();
System.out.println(resbody);
int statuscode=res.getStatusCode();
System.out.println(statuscode);
}

}
