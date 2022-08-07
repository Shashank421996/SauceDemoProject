package SauceDemo_TestScenarios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 
{
	@BeforeMethod
	 public void beforeMethod()
	 {
		System.out.println("Before Method");
	 }

	@Test
	 public void test1()
	 {
		System.out.println("test1 login");
	 }
	
	@Test
	 public void test2()
	 {
		System.out.println("test2 addtocart");
	 }
	
	@Test
	 public void test3()
	 {
		System.out.println("test3 dropdown");
	 }
	
	
	@AfterMethod
	 public void aftermethod()
	 {
		System.out.println("after method");
	 }

}
