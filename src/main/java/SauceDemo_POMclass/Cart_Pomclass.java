package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Pomclass 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	WebElement Remove;
	
	public void Remove()
	{
		Remove.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout ;
	
	public void Checkout()
	{
		Checkout.click();
	}
	
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continueShopping;
	
	public void continueShopping()
	{
		continueShopping.click();
	}
	
	public Cart_Pomclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
