package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.Screenshotutils;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_ExplicitWait extends CommonToAll {

// **Practice Selenium Project #2**
// Step 1 - Find the EMAIL ID and enter the [﻿admin@admin.com](mailto:admin@admin.com).
// Step 2 - Find the Password and enter the 1234.
// Step 3 - Find the Submit and click on the button.
// Step 4 - Wait some time.
// Step 5 - Verify the message error message.


        @Description("Verify the Login Failed message in VWO.com website")
        @Owner("Ananya Rawte")
        @Severity(SeverityLevel.BLOCKER)
        @Test(priority = 1)

        public void test_VWO_Explicit_Waits() {

            driver = edgeBrowser("https://app.vwo.com/#/login");

            // Step 1 - Find the EMAIL ID and enter the Admin@123.com.
            // <input open Tag
            // type="email"
            // class="text-input W(100%)"
            // name="username"
            // id="login-username"
            // data-qa="hocewoqisi"
            // data-gtm-form-interact-field-id="0"
            // > close Tag

            // Enter the input into loginBox  : using id here
            WebElement LoginBox = driver.findElement(By.id("login-username"));
            LoginBox.sendKeys("Admin@123.com");

            // Step 2 - Find the Password  and enter the 12345.

            // 2. Find the password inputbox and enter the password
            // <input
            // type="password"
            // class="text-input W(100%)"
            // name="password"
            // id="login-password"
            // data-qa="jobodapuxe">


            // Enter the input into password box
            WebElement PasswordBox =  driver.findElement(By.name("password"));
            PasswordBox.sendKeys("12345");

            // 3. Find the submit button and click on it.
            // <button
            // type="submit"
            // id="js-login-btn"
            // class="btn btn--positive btn--inverted W(80%) H(48px) Fz(16px)"
            // onclick="login.login(event)"
            // data-qa="sibequkica"
            // >


            // Click on Sign in button
            WebElement SignInBox = driver.findElement(By.id("js-login-btn"));
            SignInBox.click();

            // Step 5 - Verify the message error message.
            // <div
            // class="notification-box-description"
            // data-qa="rixawilomi">
            // Your email, password, IP address or location did not match</div>


            // Using explicit wait
            // Verification of failure message:

            WaitHelper waitHelper = new WaitHelper(driver);
            WebElement Verification_Failure_msg = waitHelper.waitforElementVisible(By.id("js-notification-box-msg"));
            String actual_F_msg = Verification_Failure_msg.getText();
            System.out.println(actual_F_msg);
            Assert.assertEquals(actual_F_msg,"Your email, password, IP address or location did not match");

            // Take Screenshot
            String path = Screenshotutils.capture(driver, "test_VWO_Explicit_Waits");
            System.out.println("Screenshot save at : " + path);

            // Quit the browser
            driver.quit();

        }
    }

