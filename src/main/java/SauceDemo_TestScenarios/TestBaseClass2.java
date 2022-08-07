package SauceDemo_TestScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import SauceDemo_POMclass.HomePOMpage;
import SauceDemo_POMclass.Login_POMclass;

public class TestBaseClass2 
{
		WebDriver driver;
		
		@BeforeClass
		public void method1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			System.out.println("Browser is opened");
			
			driver.get("https://www.saucedemo.com");
			
			System.out.println("URL is opened");
			driver.manage().window().maximize();
			System.out.println("Browser is maximze");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Implicit Wait apply");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			
			Login_POMclass lp = new Login_POMclass(driver);
			lp.sendUseraname();
			lp.sendPassword();
			lp.clickLoginButton();
			System.out.println("login Successfull and went to homepage");
		}
		
		@AfterMethod
		public void logoutmethod()
		{
			HomePOMpage hp = new HomePOMpage(driver);
			hp.Settingbuttonclick();
			hp.Logoutclick();
			System.out.println("clicked on logout");
			
		}
		
		@AfterClass
		public void browserclose()
		{
			driver.close();
			System.out.println("Browser is Closed");
		}
		
		

}
