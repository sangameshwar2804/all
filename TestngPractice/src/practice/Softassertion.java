package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
@Test
public void test1() {
	SoftAssert sa=new SoftAssert();
	System.out.println("hello");
	Assert.assertTrue(false);
	System.out.println("hello after assert fail");
}
@Test
public void test2() {
	SoftAssert sa=new SoftAssert();
	System.out.println("hello");
	sa.assertTrue(false);
	System.out.println("hello after assert fail");
}
}
