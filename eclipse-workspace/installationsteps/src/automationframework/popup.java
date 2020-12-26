package automationframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		WebElement prompt=driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
		prompt.click();
		
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		String prompttext=a1.getText();
		System.out.println(prompttext);
		a1.sendKeys("sree");
		a1.accept();
		

	}

}
