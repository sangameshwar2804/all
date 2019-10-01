package Com.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.wbl.main.LoginPage;

public class LoginPageTest {
@Test(groups="smoke")
public void verifyLogin() {
	LoginPage l=new LoginPage();
	Assert.assertEquals(l.login(), "login-Sucess");
}
}
