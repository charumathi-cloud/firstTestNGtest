package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport1 {

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("MyFirstTest", "this is to validate the sample webpage");
        
        System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		test1.log(Status.INFO, "driver is ready to test this test scripts");

		driver.get("http://automationpractice.com/index.php");
		test1.pass("Navigated to automationpractice.com");
		
		driver.manage().window().maximize();
		test1.pass("browser got maximized");
		
		driver.findElement(By.className("login")).click();
		test1.pass("login button clicked");
		
		driver.findElement(By.id("login_form"));
		test1.pass("login form identified");
		
		driver.findElement(By.id("email")).sendKeys("charumathi123@gmail.com");
		test1.pass("email is being entered correctly");
		
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("password@123");
		test1.pass("password is being entered correctly");
		
		driver.findElement(By.id("SubmitLogin")).click();
		test1.pass("submit button clicked");
		
		driver.close();
		driver.quit();
		test1.pass("close the browser");
		
		test1.info("Test completed");
		extent.flush();
		
        
        
		

	}

}
