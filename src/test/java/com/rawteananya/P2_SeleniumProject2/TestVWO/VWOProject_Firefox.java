package com.rawteananya.P2_SeleniumProject2.TestVWO;



// **Practice Selenium Project #2**
// Step 1 - Find the EMAIL ID and enter the [﻿admin@admin.com](mailto:admin@admin.com).
// Step 2 - Find the Password and enter the 1234.
// Step 3 - Find the Submit and click on the button.
// Step 4 - Wait some time.
// Step 5 - Verify the message error message.


import com.rawteananya.utils.Screenshotutils;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWOProject_Firefox {


    WebDriver driver; // Global WebDriver


    @Description("Verify the Login Failed message in VWO.com website")
    @Owner("Ananya Rawte")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 1)

    public void test_VWO_FirefoxBrowser() {

        driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");

        // Maximize the window
        driver.manage().window().maximize();

        // Enter the input into loginBox
        WebElement LoginBox = driver.findElement(By.id("login-username"));
        LoginBox.sendKeys("Admin@123.com");

        // Enter the input into password box

        WebElement PasswordBox =  driver.findElement(By.name("password"));
        PasswordBox.sendKeys("12345");


        // Click on Sign in button
        WebElement SignInBox = driver.findElement(By.id("js-login-btn"));
        SignInBox.click();

        // Proper 3 second wait
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verification of failure message

        WebElement Verification_Failure_msg = driver.findElement(By.className("notification-box-description"));
        String actual_F_msg = Verification_Failure_msg.getText();
        System.out.println(actual_F_msg);
        Assert.assertEquals(actual_F_msg,"Your email, password, IP address or location did not match");

        // Take Screenshot

        String path = Screenshotutils.capture(driver, "Login_Test");
        System.out.println("Screenshot save at : " + path);


        // Quit the browser

        driver.quit();

    }
}
