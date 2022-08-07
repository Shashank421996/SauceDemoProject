package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POMclass 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userName;

	public void sendUseraname()
	{
		userName.sendKeys("standard_user");
	}

	@FindBy(xpath="//input[@id='password']")
	WebElement passWord;
	
	
	public void sendPassword()
	{
		passWord.sendKeys("secret_sauce");
	}

	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

	
	public Login_POMclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
