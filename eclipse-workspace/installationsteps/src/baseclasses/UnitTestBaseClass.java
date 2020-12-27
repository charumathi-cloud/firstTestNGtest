package baseclasses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UnitTestBaseClass {
	@BeforeSuite
    public void globalSetup(){
        System.out.println("Global setup - will run once for all tests");
    }

    @BeforeMethod
    public void globalBeforeMethodSetup(){
        System.out.println("This is global beforeMethod");
    }
        
        @Test
    	public void googleTitleTest() {
    		System.out.println("googleTitleTest");
    	}

}

