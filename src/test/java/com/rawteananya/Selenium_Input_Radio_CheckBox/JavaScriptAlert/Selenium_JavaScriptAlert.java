package com.rawteananya.Selenium_Input_Radio_CheckBox.JavaScriptAlert;

import com.rawteananya.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class Selenium_JavaScriptAlert extends CommonToAll {

    @Description("Verify JavaScript Alerts")
    @Test
    public void jsAlert(){


        // Xpath :
        // JS alert button = //button[text()='Click for JS Alert']
        // JS Confirm button = //button[text()='Click for JS Confirm']
        // JS Prompt = //button[text()='Click for JS Prompt']
        // Result = //p[@id='result']

        //// JS alert button:

        driver = firefoxBrowser("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement js_alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        js_alert.click();

        WebDriverWait explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicit_wait.until(ExpectedConditions.alertIsPresent());

        Alert js_alert1 = driver.switchTo().alert();
        js_alert1.accept();

        // Verification of message
        WebElement result_alert = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(result_alert.getText());
        Assert.assertEquals(result_alert.getText(),"You successfully clicked an alert");

    }
}
