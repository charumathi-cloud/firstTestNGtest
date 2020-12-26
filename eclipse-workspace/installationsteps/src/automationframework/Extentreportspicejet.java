package automationframework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportspicejet {

	public static void main(String[] args) {
ExtentHtmlReporter Reporter1 = new ExtentHtmlReporter("spicejetcheckbox.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(Reporter1);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("spicejet", "this is to validate the sample webpage");
        
		
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		test1.log(Status.INFO, "driver is ready to test this test scripts");

		
		driver.get("https://www.spicejet.com/");
		test1.pass("Navigated to spicejet.com");
		
		driver.manage().window().maximize();
		test1.pass("browser got maximized");
		
		
		WebElement familyfriendcheck = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		familyfriendcheck.click();
		test1.pass("1st checkbox is been checked");
		
		System.out.println("familyfriend checkbox is selected?" +familyfriendcheck.isSelected());
		test1.pass("boolean result is printed in the console");
		
		
		WebElement seniorcitizencheck = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		seniorcitizencheck.click();
		test1.pass("2nd checkbox is been checked");
		
		System.out.println("seniorcitizen checkbox is selected?" +seniorcitizencheck.isSelected());
		test1.pass("boolean result is printed in the console");
		
		WebElement armedforcecheck= driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		armedforcecheck.click();
		test1.pass("3rd checkbox is been checked");
		
		System.out.println("Armed force checkbox is selected?" +armedforcecheck.isSelected());
		test1.pass("boolean result is printed in the console");
		
		WebElement studentcheck= driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		studentcheck.click();
		test1.pass("3rd checkbox is been checked");
		
		System.out.println("student checkbox is selected?" +studentcheck.isSelected());
		test1.pass("boolean result is printed in the console");
		
		WebElement minorcheck= driver.findElement(By.id("ctl00_mainContent_chk_Unmr"));
		test1.pass("4th checkbox is not checked");
		System.out.println("student checkbox is selected?" +minorcheck.isSelected());
		test1.pass("boolean result is printed in the console");
		
		
		
		driver.close();
		driver.quit();
		test1.pass("close the browser");
		
		test1.info("Test completed");
		extent.flush();
		
		
		

	}

}
