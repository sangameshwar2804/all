package Com.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.wbl.main.Reverse;

public class ReverseTest {
static Reverse r=null;
@Test
public void revTest() {
	r=new Reverse();
	String actual=r.rev("hello");
	Assert.assertEquals(actual, "olleh");
}
@Test
public void revTest1() {
	r=new Reverse();
	String actual=r.rev("asas");//sasa
	String exc=r.rev("asas");//sasa
	Assert.assertEquals(actual, exc);
	
}
}
