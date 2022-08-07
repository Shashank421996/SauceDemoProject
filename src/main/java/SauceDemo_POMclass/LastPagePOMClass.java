
package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement order;
	
	public String GetText()
	{
		return order.getText();
		
	}
	
	public LastPagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	

}
