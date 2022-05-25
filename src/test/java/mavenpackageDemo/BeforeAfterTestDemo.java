package mavenpackageDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestDemo {
    @AfterTest//execute 1 A then B then A
    @Test
    public static void testA()
    {
        System.out.println("hiiiii execute A.......");
    }
    @Test(groups = "abc")
    public static void testB()
    {
        System.out.println("hiiiii execute B....");
    }
    @BeforeTest
//0/p c,a,b,a
    @Test
    public static void testC()
    {
        System.out.println("Execute c-------------------");
    }
}
