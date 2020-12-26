package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfileusingsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement upload = driver.findElement(By.id("fileupload1"));
		act.moveToElement(upload).perform();
		upload.sendKeys("E:\\charu data\\nirish photos");
	}

}
