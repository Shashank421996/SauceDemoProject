package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement Finishbutton;
	
	public void clickonFinishbutton()
	{
		Finishbutton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement Cancelbutton;
	
	public void clickonCancelbutton()
	{
		Cancelbutton.click();
	}
	
	public BillingPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
