package practice;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Dependson {
@Test
public void doLogin() {
	System.out.println("enter userid");
	System.out.println("enter password");
	System.out.println("click on submit");
	assertTrue(false);;
}
@Test(dependsOnMethods="doLogin",alwaysRun=true)
public void selectItem() {
	System.out.println("selected laptop");
}
@Test(dependsOnMethods="selectItem",alwaysRun=true)
public void cartPage() {
	System.out.println("checkout");
}
}
