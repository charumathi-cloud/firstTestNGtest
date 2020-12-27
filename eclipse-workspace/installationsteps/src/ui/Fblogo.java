package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Fblogo {

    WebDriver driver;

    @BeforeMethod
    public void startUpBrowser(){
        System.setProperty("webdriver.chrome.driver","E:/selenium/essentials/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }


    @Test(description = "No exception thrown by findElement considered a succsessful test")
    public void checkLogoIsPresent(){
        driver.findElement(By.className("fb_logo _8ilh img"));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        System.out.println("Closing down the browser");
        driver.close();
    }
}