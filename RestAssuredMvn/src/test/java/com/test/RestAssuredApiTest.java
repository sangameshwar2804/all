package com.test;

import org.testng.annotations.Test;

import com.wbl.base.BaseApiTest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.net.URI;
public class RestAssuredApiTest extends BaseApiTest {

	@Test
	public void get() {
	
		given().when().get(endpoint).then().statusCode(200);
	}
	
}
