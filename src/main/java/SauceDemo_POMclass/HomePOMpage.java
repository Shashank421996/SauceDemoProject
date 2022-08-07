package SauceDemo_POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMpage
{
	private WebDriver driver;
	private Select s;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private	WebElement addtocart1;
	
	public void clickonaddtocart1()
	{
		addtocart1.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addtocart2;

         public void clickonaddtocart2()
        {
           addtocart2.click();
        }
	
	
         @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
         private WebElement addtocart3;

              public void clickonaddtocart3()
             {
                addtocart3.click();
             }
	
              @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
              private WebElement addtocart4;

                    public void clickonaddtocart4()
                   {
                      addtocart4.click();
                   }
                    
          @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
          private WebElement addtocart5;

            public void clickonaddtocart5()
               {
                  addtocart5.click();
               }       
	
	
            @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
            private WebElement addtocart6;

            public void clickonaddtocart6()
               {
                  addtocart6.click();
               } 
      
            @FindBy(xpath="//div[@id='shopping_cart_container']")
           private WebElement cartcontainer;
            
            public void cartcontainerclick()
            {
            	cartcontainer.click();
            }
            
            public String gettext()
            {
            	return cartcontainer.getText();
            }
            
            @FindBy(xpath="//html//body//div//select")
            private WebElement Dropdown;
            
            public void Dropdownclick()
            {
            	Dropdown.click();
            	s.selectByValue("lohi");
            }
            
            @FindBy(xpath="//option[text()='Price (low to high)']")
            private WebElement dropdownnew;
            
            public String GetText()
            {
				return dropdownnew.getText();
			
            }
            
            @FindBy(xpath="//button[@id='react-burger-menu-btn']")
            private WebElement Settingbutton;
            
            public void Settingbuttonclick()
            {
            	Settingbutton.click();
            }
            
            @FindBy(xpath="//a[@id='inventory_sidebar_link']")
            private WebElement Allitems;
            
            public void Allitemsclick()
            {
            	Allitems.click();
            }
            
            @FindBy(xpath="//a[@id='about_sidebar_link']")
            private WebElement About;
            
            public void Aboutclick()
            {
            	About.click();
            }
            
            @FindBy(xpath="//a[@id='logout_sidebar_link']")
            private WebElement Logout;
            
            public void Logoutclick()
            {
            	Logout.click();
            }
            
            @FindBy(xpath="//a[@id='reset_sidebar_link']")
            private WebElement Reset;
            
            public void Resetclick()
            {
            	Reset.click();
            }
            
            public HomePOMpage(WebDriver driver)
            {
            	this.driver = driver;
            	PageFactory.initElements(driver, this);
            	 s = new Select(Dropdown);
            }
            
            
            
            
	
	
	
	
	
	
	
	
	
	

}
