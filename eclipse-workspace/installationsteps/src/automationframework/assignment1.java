package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("login_form"));
		driver.findElement(By.id("email")).sendKeys("charumathi123@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("password@123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		
		

	}

}
