package Com.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.wbl.main.Homepage1;

public class TestNg1 {
	 Homepage1 hm;
	@BeforeClass
	public void beforeClass() {
	hm=new Homepage1();	
	}

  @Test()
  public void test1() {
	hm=new Homepage1();
			Assert.assertEquals(hm.signup(), "registration-suces");
  }
  @Test(dependsOnMethods="test1",alwaysRun=true)
  public void test2() {
	  
			Assert.assertEquals(hm.login(), "Login Sucess");
  }
  @Test(groups={"smoke","group2"})
  public void test3() {
	 
			Assert.assertEquals(hm.doSearch(), "Enter valu in SearchBox");
  }
  @Test(dependsOnGroups= {"smoke","group2"},alwaysRun=true)
  public void test4() {
	  Assert.assertEquals(hm.laptopPage(), "add-to-car");
  }
}
