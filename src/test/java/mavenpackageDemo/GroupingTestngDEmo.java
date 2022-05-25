//depends on group
package mavenpackageDemo;
import org.testng.annotations.Test;

public class GroupingTestngDEmo {
    @Test(groups = {"abc"})
    public static void testA()
    {
        System.out.println("Execute A--------------");
    }
    @Test//default proirity is always 0
    public static void testB()
    {
        System.out.println("Execute B--------------");
    }
    @Test(groups = {"abc"})
    public static void testc()
    {
        System.out.println("Execute c--------------");
    }
}
