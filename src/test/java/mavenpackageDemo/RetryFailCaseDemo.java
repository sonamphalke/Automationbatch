package mavenpackageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailCaseDemo {
    public static WebDriver driver;
    @Test
    public void retrycasedemo()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver() ;
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("sonam phalke");
        driver.findElement(By.id("pass")).sendKeys("1234");
        driver.findElement(By.name("login")).click();
        Assert.fail("fail");

    }
}
