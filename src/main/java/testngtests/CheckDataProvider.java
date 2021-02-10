package testngtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckDataProvider {

	
	GenMap gen = new GenMap();
	
	
	@Test(dataProvider="giver", enabled=false)
	public void test(String k)
	{
		System.out.println(k);

	}
	

	@Test(dataProvider="giver", enabled=true)
	public void tests(String k)
	{
		System.out.println(gen.getAListOfPayloads()[0].toString());

	}
	
	@DataProvider(name="giver")
	public Object[][] giveThis(){
		return new Object[][] {{"this"},{"that"}};
	}
}
