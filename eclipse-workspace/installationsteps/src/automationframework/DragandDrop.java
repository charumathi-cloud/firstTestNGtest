package automationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtm...");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		

	}

}
