package mavenpackageDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DataProvider {
    @Test(dataProvider = "getData")
    public void DataMatric(String username,String pass,int phone)
    {

    }
    @DataProvider
    //create 2 diamentionala array
    //create onject
    public Object[][] getData()
    {
Object [][] data =new Object[3][3];//{row}{colom}
        data[0][0]="name11";
        data[0][1]="password2";
        data[0][2]=1234;

        data[1][0]="name2";
        data[1][1]="password2";
        data[1][2]=1234;

        data[2][0]="name3";
        data[2][1]="password3";
        data[2][2]=1234;


        return data;

    }

}