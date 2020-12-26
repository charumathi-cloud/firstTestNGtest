package automationframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		button.click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		String alerttext=a1.getText();
		System.out.println(alerttext);
		a1.dismiss();

	}

}
