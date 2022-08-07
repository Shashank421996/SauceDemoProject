package SauceDemo_TestScenarios;
import org.testng.Assert;
import org.testng.annotations.Test;
import SauceDemo_POMclass.HomePOMpage;

public class TC004_AddToCartScenario extends TestBaseClass
{
	
	@Test
	public void addtoCartFunctionality() throws InterruptedException
	{
		
		Thread.sleep(2000);
		HomePOMpage hp = new HomePOMpage(driver);
		hp.clickonaddtocart1();
		Thread.sleep(2000);
	
		String ActualResult = hp.gettext();
		System.out.println("Expected Result is "+ ActualResult);
		Thread.sleep(2000);
		String ExpectedResult = "1";
		System.out.println("Actual Result is "+ ExpectedResult);
		
		Thread.sleep(2000);
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
		System.out.println("Validation is done");
		Thread.sleep(2000);
	}
	
	

}
