import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class Sample {
	String baseUrl="";
@Test
public void getReq() {
	given().when().get(baseUrl);
}
}
