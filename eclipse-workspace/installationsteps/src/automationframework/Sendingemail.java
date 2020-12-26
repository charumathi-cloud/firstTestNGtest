package automationframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendingemail {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("identifierId")).sendKeys("autoantojsu@gmail.com");
		WebElement nextbtn1=driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
		 nextbtn1.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("auto12345");
WebElement nextbtn2=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
nextbtn2.click();

		
		driver.findElement(By.className("T-I T-I-KE L3"));
		driver.findElement(By.id(":so")).sendKeys("autoantojsu@gmail.com");
		driver.findElement(By.id(":s6")).sendKeys("sending mail");
		driver.findElement(By.id(":tb")).sendKeys("welcome to this page");
		driver.findElement(By.id(":rw")).click();
		driver.findElement(By.className("gb_Ha gbii"));
		driver.findElement(By.id("gb_71")).click();
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
