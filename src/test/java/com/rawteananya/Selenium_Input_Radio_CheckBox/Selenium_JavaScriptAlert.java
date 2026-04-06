package com.rawteananya.Selenium_Input_Radio_CheckBox;

import com.rawteananya.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_JavaScriptAlert extends CommonToAll {

    @Description("Verify JavaScript Alerts")
    @Test
    public void jsAlert(){

        driver = firefoxBrowser("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement js_alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.accept();

    }
}
