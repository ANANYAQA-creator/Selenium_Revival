package com.rawteananya.ex04_SeleniumWebTable;

import com.rawteananya.utils.CommontoALL;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_Dynamic_Webtable extends CommontoALL {


    @Description("Verify the dynamic webtable")
    @Test
    public void DynamicWebtable() {

        chromeBrowser("https://awesomeqa.com/webtable1.html");

        // Find the xpath for dynamic webtable
        WebElement dynamic_table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]"));

        // Rows and Columns

        //Rows
        List<WebElement> rows_table = dynamic_table.findElements(By.tagName("tr"));
        for (int i = 0; i < rows_table.size(); i++) {

            //Columns
            List<WebElement> col_table = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement c: col_table){
                System.out.println(c.getText());  // print all columns
            }

        }
    }

}

