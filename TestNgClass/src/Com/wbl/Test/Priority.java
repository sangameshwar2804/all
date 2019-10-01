package Com.wbl.Test;

import org.testng.annotations.Test;

public class Priority {
@Test
public void abc1() {
	System.out.println("1");
}
@Test(priority=1)
public void pqr() {
	System.out.println("2");
}
@Test(priority=0)
public void xyz() {
	System.out.println("3");
}
@Test(priority=2)
public void getTest() {
	System.out.println("4");
}
@Test
public void bca() {
	System.out.println("without priority");
}
}
