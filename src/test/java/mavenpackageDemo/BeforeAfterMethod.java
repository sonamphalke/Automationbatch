package mavenpackageDemo;

import org.testng.annotations.*;

public class BeforeAfterMethod {
    @AfterMethod//execute 1 A then B then A
    @Test
    public static void testA()
    {
        System.out.println("hiiiii execute A.......");
    }
    @BeforeClass
    @Test
    public static void testB()
    {
        System.out.println("hiiiii execute B....");
    }
    @Test
    public static void testC()
    {
        System.out.println("hiiiii execute C....");
    }


}
