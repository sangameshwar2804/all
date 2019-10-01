package practice;

import org.testng.annotations.Test;

public class Groups2 {
@Test(groups= {"Login","smoke"})
public void test1() {
	System.out.println("hello");
}
@Test(groups= {"Login"})
public void test2() {
	System.out.println("hello loged in");
}
}
