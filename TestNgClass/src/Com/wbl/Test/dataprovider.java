package Com.wbl.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
@Test(dataProvider="login",dataProviderClass=DataprovidrClass.class)
public void printDtat(String username,String password) {
	System.out.println("username"+username +"  "+"passwod"+" "+password);
}

}