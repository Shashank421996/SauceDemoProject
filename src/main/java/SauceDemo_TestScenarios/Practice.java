package SauceDemo_TestScenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice 
{
	
	@Test
	 public void testb()
	 {
		System.out.println("test1 login");
	 }
	
	@Test(priority=1, enabled= false)
	 public void testa()
	 {
		System.out.println("test2 addtocart");
	 }
	
	@Test (priority= 0)
	 public void testc()
	 {
		System.out.println("test3 dropdown");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
}
