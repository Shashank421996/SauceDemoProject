package SauceDemo_TestScenarios;

import org.testng.annotations.Test;

import SauceDemo_POMclass.HomePOMpage;

public class AllScenarios extends TestBaseClass2
{
	
	@Test
	public void loginFunctionality()
	{
		String ActualURl= driver.getCurrentUrl();
		System.out.println(ActualURl);
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		
		if (ActualURl.equals(ExpectedURL))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("tc is failed");
		}
	}
		
		@Test(priority=2)
		public void dropDownFunctionality()
		{
			HomePOMpage hp = new HomePOMpage(driver);
			hp.Dropdownclick();

			String ActualText = hp.GetText();
			System.out.println(ActualText);
			
			String ExpectedText = "Price (low to high)";
			
			if(ActualText.equals(ExpectedText))
			{
				System.out.println("TC is passed");
			}
			
			else
			{
				System.out.println("TC is failed");
			}
		}

}

