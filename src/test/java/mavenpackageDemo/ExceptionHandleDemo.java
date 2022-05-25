package mavenpackageDemo;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionHandleDemo {

    @Test(expectedExceptions = {ArithmeticException.class,IOException.class,Exception.class})
    public static void functionA()
    {
        System.out.println("arrithmatic");
        System.out.println(10/0);
    }
    @Test(expectedExceptions = Exception.class)
    public static void functionB() throws IOException
    {
        System.out.println("ioexception......");
        throw new IOException();
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public static void functionC()
    {
        System.out.println("hiiiiiii");
    }

}
