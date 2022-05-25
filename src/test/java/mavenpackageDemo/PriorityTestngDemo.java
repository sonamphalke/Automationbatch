package mavenpackageDemo;

import org.testng.annotations.Test;
//if we are not pass any priority it will be executed sequencly
public class PriorityTestngDemo {
    @Test(priority = 2)
    public static void testA()
    {
        System.out.println("Execute A--------------");
    }
    @Test//default proirity is always 0
    public static void testB()
    {
        System.out.println("Execute B--------------");
    }
    @Test(priority = 1)
    public static void testc()
    {
        System.out.println("Execute c--------------");
    }

}
