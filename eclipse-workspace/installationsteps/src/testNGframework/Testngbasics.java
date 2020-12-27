package testNGframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testngbasics {
	
	
	@BeforeSuite
		public void setUp()
		{
		System.out.println("setup system property for chrome");
	    }
	
	@BeforeTest
		public void LaunchBrowser()
		{
			System.out.println("Launch browser");
		}

	@BeforeClass
	   public void login()
	   {
		System.out.println("login to app");
	   }
	@BeforeMethod
	   public void enterURL()
	   {
		System.out.println("enter url");
	   }
	@Test
	public void googleTitleTest() {
		System.out.println("googleTitleTest");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("searchTest");
	}
	
	@Test
	public void logoTest() {
		System.out.println("logo Test");
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("closebrowser");
	}
	
	@AfterTest
	public void deleteall()
	{
		System.out.println("deleteallthecookies");
	}
	
	
	
	
	
	
}
