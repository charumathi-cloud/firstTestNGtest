package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Spicejetcheckbox {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		

		
		driver.get("https://www.spicejet.com/");
		
		
		driver.manage().window().maximize();
		
		
		
		WebElement familyfriendcheck = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		familyfriendcheck.click();
		
		System.out.println("familyfriend checkbox is selected?" +familyfriendcheck.isSelected());
		
		
		
		WebElement seniorcitizencheck = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		seniorcitizencheck.click();
		
		
		System.out.println("seniorcitizen checkbox is selected?" +seniorcitizencheck.isSelected());
		
		
		WebElement armedforcecheck= driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		armedforcecheck.click();
		
		System.out.println("Armed force checkbox is selected?" +armedforcecheck.isSelected());
		
		WebElement studentcheck= driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		studentcheck.click();
		
		
		System.out.println("student checkbox is selected?" +studentcheck.isSelected());
		
		
		WebElement minorcheck= driver.findElement(By.id("ctl00_mainContent_chk_Unmr"));
		
		System.out.println("student checkbox is selected?" +minorcheck.isSelected());
		
		
		
		
		
		
		
		

	}

}
