package com.rawteananya.Selenium_Input_Radio_CheckBox.JavaScriptAlert;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_JavaScriptAlert_accept_dismiss extends CommonToAll {

    @Test
    public void js_Confirm_Cancel() {

        // JS Confirm and Cancel button = //button[text()='Click for JS Confirm']

        driver = chromeBrowser("https://the-internet.herokuapp.com/javascript_alerts");

        /* JS confirm
        WebElement jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsConfirm.click();
        Alert jsConfirmAlert = driver.switchTo().alert();
        jsConfirmAlert.accept();

        //Verification of confirm msg

        WebElement jsConfirm_msg = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(jsConfirm_msg.getText());
        Assert.assertEquals(jsConfirm_msg.getText(),"You clicked: Ok");

         */

       // JS cancel

        WebElement jsCancel = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsCancel.click();
        Alert jsCancel_alert = driver.switchTo().alert();
        jsCancel_alert.dismiss();

         // Verfication of cancel message

        WebElement jsCancel_msg = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(jsCancel_msg.getText());
        Assert.assertEquals(jsCancel_msg.getText(),"You clicked: Cancel");

    }
}