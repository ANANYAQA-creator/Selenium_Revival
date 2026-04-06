package com.rawteananya.Selenium_Input_Radio_CheckBox;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_Modal extends CommonToAll {

    @Description("How to handle modals")
    @Test
    public void mmtModal (){

        driver = firefoxBrowser("https://www.makemytrip.com/");

        // Using wait to appear modals on screen

        WaitHelper waitHelper = new WaitHelper(driver);

        WebElement modal1 = waitHelper.waitforElementVisible(By.xpath("//span[@data-cy='closeModal']"));
        modal1.click();

        WebElement modal2 = waitHelper.waitforElementVisible(By.xpath("//div[@class='tp-dt-header-icon']//img[@alt='minimize']"));
        modal2.click();

    }

}
