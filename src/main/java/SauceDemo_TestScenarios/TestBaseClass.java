package SauceDemo_TestScenarios;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import SauceDemo_POMclass.Login_POMclass;
import UtilityPackage.ScreenShot;

public class TestBaseClass 
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void method1(String browserName) throws IOException
	{
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
	    driver = new ChromeDriver();
	}   
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
	    driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("Throw the error");
	}
	   
		System.out.println("Browser is opened");
		
		driver.get("https://www.saucedemo.com");
		
		System.out.println("URL is opened");
		driver.manage().window().maximize();
		System.out.println("Browser is maximze");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Implicit Wait apply");
		
		Login_POMclass lp = new Login_POMclass(driver);
		lp.sendUseraname();
		lp.sendPassword();
		lp.clickLoginButton();
		System.out.println("login Successfull and went to homepage");
		
		ScreenShot shot = new ScreenShot();
		shot.TakesSceenShot(driver);
	}
	@AfterMethod
	public void method2()
	{
		driver.close();
		System.out.println("Browser is Closed");
		
	}
	

}
