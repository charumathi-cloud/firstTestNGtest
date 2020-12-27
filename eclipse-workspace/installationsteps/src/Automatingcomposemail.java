import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatingcomposemail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/selenium/essentials/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/?tab=wm&ogbl#inbox");
		driver.manage().window().maximize();
		driver.findElement(By.className("T-I T-I-KE L3"));
		driver.findElement(By.id(":so")).sendKeys("autoantojsu@gmail.com");
		driver.findElement(By.id(":s6")).sendKeys("sending mail");
		driver.findElement(By.id(":tb")).sendKeys("welcome to this page");
		driver.findElement(By.id(":rw")).click();
		driver.findElement(By.className("gb_Ha gbii"));
		driver.findElement(By.id("gb_71")).click();

	}

}
