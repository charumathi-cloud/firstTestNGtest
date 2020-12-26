package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("Desktop\\firepic.JPEG");
		WebElement check=driver.findElement(By.id("terms"));
		check.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();

	}

}
