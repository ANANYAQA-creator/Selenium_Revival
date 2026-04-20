package com.rawteananya.Selenium_DataDrivenTesting;

import com.rawteananya.utils.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_DDT_Method1_HARDCODE extends CommonToAll {

    @Test(dataProvider = "getData")
    public void vwo_login(String email,String password, String ExpectedResult){

        System.out.println("Login");
        System.out.println(email + " | "+ password + " | " + " | " + ExpectedResult);
    }

    // Method1 : HARD CODE
    @DataProvider
    public Object [][] getData(){
            return new Object[][]{
                    new Object[] {"admin123@gmail1.com","test1","ER1"},
                    new Object[] {"admin123@gmail2.com","test2","ER2"}
            };


    };
}
