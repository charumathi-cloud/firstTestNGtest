package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class assignment {

	public static void main(String[] args)  {
		
		
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreportsforassignment.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("automationpracticesite", "reports for the test scripts");
        
        System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
		test1.log(Status.INFO, "driver is ready to test this test scripts");
		
		driver1.get("http://automationpractice.com/index.php");
		test1.pass("Navigated to automationpractice.com");
		
		driver1.manage().window().maximize();
		test1.pass("browser got maximized");
		
		driver1.findElement(By.className("login")).click();
		test1.pass("sign in button clicked");
		
		driver1.findElement(By.id("email_create")).sendKeys("charumathi123jan@gmail.com");
		test1.pass("email is being entered");
		
		driver1.findElement(By.id("SubmitCreate")).click();
		test1.pass("next button - clicked");
		
		driver1.findElement(By.id("id_gender1")).click();
		test1.pass("radio button is tested");
		
		driver1.findElement(By.id("id_gender2")).click();
		test1.pass("radio button is tested");
		
		
		driver1.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("charumathi");
		test1.pass("first name is entered successfully");
		
		
		driver1.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("jsu");
		test1.pass("last name is entered successfully");
		
		
		driver1.findElement(By.xpath("//input[@id='passwd']")).sendKeys("password@123");
		test1.pass("password is entered");
		
		
		Select date=new Select(driver1.findElement(By.id("days")));
		date.selectByVisibleText("10  ");
		test1.pass("days is entered successfully");
		
		Select month=new Select(driver1.findElement(By.id("months")));
		month.selectByVisibleText("June ");
		test1.pass("month is entered successfully");
		
		Select year=new Select(driver1.findElement(By.id("years")));
		year.selectByVisibleText("2011  ");
		test1.pass("year is entered successfully");
		
		
		WebElement check=driver1.findElement(By.id("newsletter"));
		check.click();
		test1.pass("check box is located successfully");
		
		
		driver1.findElement(By.id("firstname")).sendKeys("fname");
		test1.pass("first name is entered successfully");
		
		driver1.findElement(By.id("lastname")).sendKeys("lname");
		test1.pass("last name is entered successfully");
		
		driver1.findElement(By.id("company")).sendKeys("HCL");
		test1.pass("company name is entered successfully");
		
		driver1.findElement(By.xpath("//input[@id='address1']")).sendKeys("chrompet");
		test1.pass("Address is entered successfully");
		
		driver1.findElement(By.id("city")).sendKeys("chennai");
		test1.pass("city name is entered successfully");
		
		Select state=new Select(driver1.findElement(By.id("id_state")));
		state.selectByVisibleText("California");
		test1.pass("state name is entered successfully");
		
		driver1.findElement(By.id("postcode")).sendKeys("60000");
		test1.pass("postalcode is entered successfully");
		
		driver1.findElement(By.id("phone_mobile")).sendKeys("9082356663");
		test1.pass("mobile number is entered successfully");
		
		driver1.findElement(By.name("submitAccount")).click();
		test1.pass("submit button is clicked");
		
		driver1.close();
		driver1.quit();
		test1.pass("close the browser");
		
		test1.info("Test completed");
		extent.flush();
		
		
		
		

	}

}
