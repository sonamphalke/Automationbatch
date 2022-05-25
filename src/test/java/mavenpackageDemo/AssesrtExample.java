package mavenpackageDemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class AssesrtExample {
  //  WebDriver driver;

//assesrt is used to check n compaire actual result to expected result
    @Test
    void assertdemo(){

        String str="sonam";
        //syntax
        Assert.assertEquals(str,"sonam","this is actual result");
        //Assert.assertEquals(str,"sonu","condition is true");
        Assert.assertFalse(str.contains("test"),"condition should be true");
    }
}
