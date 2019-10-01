package practice;

import org.testng.annotations.Test;

public class Expectedexception {
@Test(expectedExceptions=ArithmeticException.class)
public void test1() {
	int i=1,j=0;
	int c=i/j;
	System.out.println(c);
}
}
