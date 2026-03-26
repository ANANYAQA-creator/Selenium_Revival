package com.rawteananya.SeleniumProject3;

// You need to basically go to app.vwo.com,
// then click on the "Start a Trial" button.
// Then you need to add an invalid email and verify,
// and click on the radio box also. And then verify that the
// "Create" button is not clickable and you get an error which is
// "The email address you have entered is incorrect."

import com.rawteananya.utils.CommontoALL;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_Linktext_PartialLinkText_TagName extends CommontoALL {


    @Description("Verify the email error message in Start a free trial page.")
    @Test ()
    public void VWO_Project(){

        WebDriver driver; // Global Webdriver

        driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Now needed to store the parent-window  : because new tab will open
        String parentWindow = driver.getWindowHandle();

        // Click on start a free trial
        WebElement Start_a_free_trail = driver.findElement(By.partialLinkText("Start a FREE TRIAL"));
        Start_a_free_trail.click();

        // Now move to Get all Window Handles
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Wait for sometime
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Input the data into Business email box

        WebElement business_email_box = driver.findElement(By.id("page-v1-step1-email"));
        business_email_box.sendKeys("Abc.@cts.com");

        // Click on the agree check box

        WebElement Agree_checckbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        Agree_checckbox.click();

        // Click on Create a free trail account

        WebElement Create_a_Account = driver.findElement(By.tagName("button"));
        Create_a_Account.click();

        // Wait for sometime

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement error_msg_wait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("invalid-reason")));

        // Now verification of Error message : The email address you entered is incorrect.

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(error_msg.getText());

        // Assertion to verify the email error message

        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        // Close the Browser
        closeBrowser();

    }
}
