package com.rawteananya.Selenium_DataDrivenTesting;

import com.rawteananya.utils.CommonToAll;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_DDT_Method2 extends CommonToAll {

    @Test(dataProvider = "getData")
    public void vwo_login(String email,String password){
      //  driver = chromeBrowser("https://app.vwo.com/#/login");
        System.out.println("Running");
        System.out.println(email + " | "+ password);
    }


    @DataProvider
    public Object [][] getData(){

        // Read the data from excel file
        // Convert this excel data into 2d array Object
        // return that array

        return utilExcel.getTestDatafromExcel("sheet1");

    }
}

