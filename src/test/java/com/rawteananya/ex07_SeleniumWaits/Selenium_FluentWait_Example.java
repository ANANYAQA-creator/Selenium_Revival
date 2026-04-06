package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_FluentWait_Example extends CommonToAll {

    @Test
    public void fwait(){

        driver = chromeBrowser("https://app.vwo.com/#/login");

        // Enter the input into loginBox  : using id here
        WebElement LoginBox = driver.findElement(By.id("login-username"));
        LoginBox.sendKeys("Admin@123.com");


        // Enter the input into password box
        WebElement PasswordBox =  driver.findElement(By.name("password"));
        PasswordBox.sendKeys("12345");

        // Click on Sign in button
        WebElement SignInBox = driver.findElement(By.id("js-login-btn"));
        SignInBox.click();

        // Using fluent wait

        WaitHelper waitHelper = new WaitHelper(driver);
      WebElement error_msg =   waitHelper.fluentWaitForVisibility(By.className("notification-box-description"),10,2);

      String actual_error_msg = error_msg.getText();
        System.out.println(actual_error_msg);
        Assert.assertEquals(actual_error_msg,"Your email, password, IP address or location did not match");

    }
}
