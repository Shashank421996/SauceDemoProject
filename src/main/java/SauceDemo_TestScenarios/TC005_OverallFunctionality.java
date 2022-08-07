package SauceDemo_TestScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import SauceDemo_POMclass.BillingPOMClass;
import SauceDemo_POMclass.Cart_Pomclass;
import SauceDemo_POMclass.Checkout_POMclass;
import SauceDemo_POMclass.HomePOMpage;
import SauceDemo_POMclass.LastPagePOMClass;

public class TC005_OverallFunctionality extends TestBaseClass
{
	@Test
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
		
		Assert.assertEquals(ActualResult, ExpectedResult);
		
	}
}
