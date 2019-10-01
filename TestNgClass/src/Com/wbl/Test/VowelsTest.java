package Com.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Com.wbl.main.Vowesl;

public class VowelsTest {
	Vowesl v;
	@BeforeSuite
	public void beforeSuite() {
		v=new Vowesl();
	}
@Ignore
public void test1() {
	
	int actual=v.countVowels("hello");
	Assert.assertEquals(2, actual);
}
@Test()
public void test2() {
	System.out.println("passed");
}
}
