//invocation count use no of time method invoke couth is 2 execuete 2 time
//threadpoolsize is  allocate multiple thread to single method
package mavenpackageDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
    public static WebDriver driver;

    @Test(threadPoolSize = 2,invocationCount = 2)
    public void Parellaltest1()
    {

        System.out.println("thread 1..." + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver() ;
        driver.get("https://www.google.com");


    }
    @Test
    public void Parellaltest2()
    {
        System.out.println("thread 2......"+Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver() ;
        driver.get("https://www.google.com");

    }
}
