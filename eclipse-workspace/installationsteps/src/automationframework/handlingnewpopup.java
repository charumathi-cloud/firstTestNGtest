package automationframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingnewpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		String alerttext=a1.getText();
		System.out.println(alerttext);
		a1.accept();
		

	}

}
