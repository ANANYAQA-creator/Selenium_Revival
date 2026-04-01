package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommontoALL;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM_thread_sleep extends CommontoALL {

    @Description("Verify the Orange HRM login page")
    @Test(priority = 1)
    public void HRM_loginpage(){


        driver = chromeBrowser("https://awesomeqa.com/hr/web/index.php/auth/login");

        WaitHelper waitHelper = new WaitHelper(driver);

        WebElement username_box = waitHelper.waitforElementVisible(By.xpath("//input[@placeholder=\"Username\"]"));
        username_box.sendKeys("admin");

        WebElement password_box = waitHelper.waitforElementVisible(By.xpath("//input[@placeholder=\"Password\"]"));
        password_box.sendKeys("Hacker@4321");

        WebElement login_button = waitHelper.waitforElementClickable(By.xpath("//button[normalize-space()=\"Login\"]"));
        login_button.click();

        waitHelper.thread_sleep();

        WebElement PIM_text = waitHelper.waitforElementVisible(By.xpath("//h6[normalize-space()=\"PIM\"]"));
        Assert.assertEquals(PIM_text.getText(),"PIM");

        quitBrowser();
    }
}
