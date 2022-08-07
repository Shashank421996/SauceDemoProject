package SauceDemo_TestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import SauceDemo_POMclass.HomePOMpage;

public class TC003_VerifyDropDownFunctionality extends TestBaseClass
{
	@Test
	public void dropDownFunctionality()
	{
		HomePOMpage hp = new HomePOMpage(driver);
		hp.Dropdownclick();

		String ActualText = hp.GetText();
		System.out.println(ActualText);
		
		String ExpectedText = "Price (low to high)";
		
		Assert.assertEquals(ActualText, ExpectedText);
	}
}
