package com.rawteananya.ex04_SeleniumWebTable;

import com.rawteananya.utils.CommontoALL;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Selenium_WebTable_StaticWebtable extends CommontoALL {

    @Description("Verify the Static WebTable")
    @Test
    public void login_web_table() {

        driver = chromeBrowser("https://awesomeqa.com/webtable.html");

        //Xpath to reach any element in the table : "//table[@id="customers"]/tbody/tr["
        // i]/td[
        // j
        // ]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        // find the total number of rows
        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();

        // find the total number of columns
        int column = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        // now running the for loop

        for( int i=2; i<=row;i++)
            for(int j=1;j<=column;j++){

                String dynamic_data = first_part+i+second_part+j+third_part;
                //System.out.println(dynamic_data);
                String dynamic_data_text = driver.findElement(By.xpath(dynamic_data)).getText();
                //System.out.println(dynamic_data_text);

        // if want to print following sibling of Hellen Bennet

                if(dynamic_data_text.contains("Helen Bennett")) {
                    String country_path = dynamic_data + "/following-sibling::td";
                    String coutry_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("------");
                    System.out.println("Helen Bennett is in : " + coutry_text);
                }
            }


        // Wait thread.sleep
        WaitHelper waitHelper = new WaitHelper(driver);
        waitHelper.thread_sleep();

        // close Browser
        closeBrowser();
    }

}
