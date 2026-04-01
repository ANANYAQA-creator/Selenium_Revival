package com.rawteananya.OrangeHRM_Webtable_Dynamic_Webtable;

import com.rawteananya.utils.CommontoALL;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class OrangeHRM_Webtable_DynamicWebtable extends CommontoALL {

    @Description("learning WebTable")
    @Test
    public void orange_webtable(){

        driver= firefoxBrowser("https://awesomeqa.com/hr/web/index.php/auth/login");

        // Using explicit wait here

        WaitHelper waitHelper = new WaitHelper(driver);


        // username
        WebElement username_box = waitHelper.waitforElementVisible(By.xpath("//input[@placeholder=\"Username\"]"));
        username_box.sendKeys("admin");

        // password
        WebElement passwordbox = waitHelper.waitforElementVisible(By.name("password"));
        passwordbox.sendKeys("Hacker@4321");

        // Click on Login

        WebElement login = waitHelper.waitforElementClickable(By.xpath("//button[normalize-space()='Login']"));
        login.click();

      // Find the dynamic table

        WebElement dynamic_table = waitHelper.waitforElementVisible(By.xpath("//div[@class=\"oxd-table-body\"]"));

        // Rows

        List<WebElement> row_table = dynamic_table.findElements(By.xpath(".//div[@class=\"oxd-table-card\"]"));
        for (int i=0; i< row_table.size();i++)
        {
            // Columns
            List<WebElement> column_table = row_table.get(i).findElements(By.xpath(".//div[@role='cell']"));

            for( WebElement c: column_table){
                System.out.println(c.getText());
            }

        }
        quitBrowser();
    }
}
