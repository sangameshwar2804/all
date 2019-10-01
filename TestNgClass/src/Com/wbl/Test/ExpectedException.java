package Com.wbl.Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.wbl.main.Vowesl;

public class ExpectedException {
@DataProvider(name="voweslipdata")
	public Object[][] getData(){
	
	
	
	return new Object[][]{{"hello",2},{"aeiou",5}};
}
	@Test(dataProvider="vowelsipdata")
	public void verifyVowels(String ipdata,int expectedop)
	{
		Vowesl v=new Vowesl();
		Assert.assertEquals(expectedop, v.countVowels(ipdata));
	}
	
}

