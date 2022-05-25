//take a inpute using parameter
//1)openbroweser 2)click on mail 3)takeing inpute 4)click on sign in
package mavenpackageDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterDemo {
 public static WebDriver driver;
    @Test
    @Parameters({"browser","url","email","password"})

    public void parademo(String browser,String url,String email,String password )
    {
        if(browser.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
             driver= new ChromeDriver() ;

        }
        driver.get(url);


        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
}
