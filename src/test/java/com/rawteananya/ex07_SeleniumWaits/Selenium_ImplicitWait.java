package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class Selenium_ImplicitWait extends CommonToAll {

    private static final Logger log = LoggerFactory.getLogger(Selenium_ImplicitWait.class);

    @Description("Verify the implicit wait for element of VWO app")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void open_vwo(){

        driver = firefoxBrowser("https://app.vwo.com/#/login");
        WaitHelper waitHelper = new WaitHelper(driver);
        waitHelper.implicit_wait(10);

        // Username Box

        WebElement username_box = driver.findElement(By.xpath("//input[@id='login-username']"));
        username_box.sendKeys("ananya@cts.com");

        //Password box
        WebElement password_box = driver.findElement(By.xpath("//input[@id='login-password']"));
        password_box.sendKeys("Shivam@19");

        //Login button
        WebElement login_button = driver.findElement(By.xpath("//span[text()='Sign in' and not(@id)]"));
        login_button.click();

        quitBrowser();
    }
}
