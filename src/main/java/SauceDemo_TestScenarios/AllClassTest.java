package SauceDemo_TestScenarios;

import org.testng.annotations.Test;

import SauceDemo_POMclass.BillingPOMClass;
import SauceDemo_POMclass.Cart_Pomclass;
import SauceDemo_POMclass.Checkout_POMclass;
import SauceDemo_POMclass.HomePOMpage;
import SauceDemo_POMclass.LastPagePOMClass;

public class AllClassTest extends TestBaseClass
{
	@Test (priority=1)  
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
	
	@Test (priority=2)
	public void logoutFunctionality() 
	{
		HomePOMpage hp = new HomePOMpage(driver);
		hp.Settingbuttonclick();
		hp.Logoutclick();
		System.out.println("clicked on logout");
	
		String ActualURl= driver.getCurrentUrl();
		System.out.println(ActualURl);
		
		String ExpectedURL = "https://www.saucedemo.com/";
		
		if(ActualURl.equals(ExpectedURL))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
	}
	
	@Test (priority=3)
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
	
	@Test (priority=4)
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
		
		if(ExpectedResult.equals(ActualResult))
		{
			System.out.println("TestCase is passed");
		}
		
		else
		{
			System.out.println("TestCase is Failed");	
		}
		
		System.out.println("Validation is done");
		Thread.sleep(2000);
	}
	
	@Test (priority=5)
	public void overallFunctinality()
	{
		HomePOMpage hp = new HomePOMpage(driver);
		hp.clickonaddtocart1();
		System.out.println("Clicked on add to cart button");
		hp.cartcontainerclick();
		System.out.println("Clicked on Cart");
		
		Cart_Pomclass cp = new Cart_Pomclass(driver);
		cp.Checkout();
		System.out.println("Clicked on CheckOut button");
		
		Checkout_POMclass xyz = new Checkout_POMclass(driver);
		xyz.FirstName();
		xyz.LastName();
		xyz.PostalCode();
		xyz.ContinueButton();
		System.out.println("Clicked on Continue button");
		
		BillingPOMClass bc = new BillingPOMClass(driver);
		bc.clickonFinishbutton();
		System.out.println("Clicked on Finish button");
		
		LastPagePOMClass abc  = new LastPagePOMClass(driver);
		String ActualResult = abc.GetText();
		System.out.println("Actual Result = " + ActualResult);
		
		String ExpectedResult = "THANK YOU FOR YOUR ORDER";
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("TC is passed");
		}
		
		else
		{
			System.out.println("TC is Failed");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
