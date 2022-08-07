package SauceDemo_TestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void loginFunctionality()
	{
		String ActualURl= driver.getCurrentUrl();
		System.out.println(ActualURl);
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		
		Assert.assertEquals(ActualURl, ExpectedURL);
	}
		

}
