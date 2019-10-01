package Com.wbl.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidrClass {
	
	@Test(dataProvider="login")
	public void dataCheck(String email,String password,String status) {
		System.out.println(email+" "+password+" "+status);
	}
	@DataProvider(name="login")
	public Object[][] getData(){
	
	Object[][] data= {{"pqr@gmail.com","pqr","sucess"},{"xyz@gmail.com","abc","failure"}};
return data;	
}
}
