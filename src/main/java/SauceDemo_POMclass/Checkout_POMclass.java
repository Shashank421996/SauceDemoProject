package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_POMclass 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement FirstName;
	
	public void FirstName()
	{
		FirstName.sendKeys("xyz");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LastName;
	
	public void LastName()
	{
		LastName.sendKeys("xyz");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement PostalCode;
	
	public void PostalCode()
	{
		PostalCode.sendKeys("xyz");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueButton;
	
	public void ContinueButton()
	{
		ContinueButton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	WebElement CancelButton;
	
	public void CancelButton()
	{
		CancelButton.click();
	}
	
	public Checkout_POMclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	

}
