package Com.wbl.Test;

import org.testng.annotations.Test;

public class Groups1 {
@Test(groups="smoke")
public void test1() {
	System.out.println("smoke and functional");
}
}
