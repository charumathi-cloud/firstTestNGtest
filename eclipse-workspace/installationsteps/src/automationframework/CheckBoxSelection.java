package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		student.click();
		Boolean result = student.isSelected();
		System.out.println(result);
		String login=driver.findElement(By.id("ctl00_HyperLinkLogin")).getText();
		System.out.println(login);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
       Thread.sleep(2000);
	}

}
