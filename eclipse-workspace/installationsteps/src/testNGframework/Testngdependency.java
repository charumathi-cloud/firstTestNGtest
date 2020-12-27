package testNGframework;

import org.testng.annotations.Test;

public class Testngdependency {
	@Test
	public void loginTest() {
		System.out.println("logintest");
	}

	@Test(dependsOnMethods="loginTest")
	public void HomepageTest() {
		System.out.println("home page test");
	}
	
}
