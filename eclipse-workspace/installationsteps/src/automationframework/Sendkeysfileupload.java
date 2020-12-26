package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Sendkeysfileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("uploadextentreports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest tests = extent.createTest("my first upload", "this is to validate the fileupload");
        
        System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		tests.log(Status.INFO, "driver is ready to test this test scripts");
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		tests.pass("Navigated to www.automationtestinginsider.com");
		
		driver.manage().window().maximize();
		tests.pass("window got maximized");
		
		
		Actions act = new Actions(driver);
		WebElement upload = driver.findElement(By.id("fileupload1"));
		tests.pass("element is found using id locator");
		act.moveToElement(upload).perform();
		upload.sendKeys("E:\\charu data\\nirish photos");
		tests.pass("photos is been uploaded");
		
		driver.close();
		driver.quit();
		tests.pass("close the browser");
		
		tests.info("Test completed");
		extent.flush();


	}

}
