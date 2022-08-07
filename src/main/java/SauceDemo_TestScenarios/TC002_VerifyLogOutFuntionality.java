package SauceDemo_TestScenarios;
import org.testng.Assert;
import org.testng.annotations.Test;
import SauceDemo_POMclass.HomePOMpage;

public class TC002_VerifyLogOutFuntionality extends TestBaseClass
{
	@Test
	public void logOutFunctionality() 
	{
		HomePOMpage hp = new HomePOMpage(driver);
		hp.Settingbuttonclick();
		hp.Logoutclick();
		System.out.println("clicked on logout");
	
		String ActualURl= driver.getCurrentUrl();
		System.out.println(ActualURl);
		
		String ExpectedURL = "https://www.saucedemo.com/";
		
		Assert.assertEquals(ActualURl, ExpectedURL);
	}
	

}
