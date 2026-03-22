package com.rawteananya.ex02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.*;

public class TestSelenium08_Assertions_AssertJ {

    // TestNG Assertion : Assertion means checking the actual value is equal to expected value.

    @Description("Verify that title is visible for mppsc website")
    @Test
    public void SeleniumAssertion(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://mppsc.mp.gov.in/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"MADHYA PRADESH PUBLIC SERVICE COMMISSION");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.close();
    }

    // AssertJ

    @Description("Verify the title is visible for google.com")
    @Test
    public void openMPPSC () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
   System.out.println(driver.getTitle());
   System.out.println(driver.getCurrentUrl());
   assertThat(driver.getCurrentUrl()).isNotNull().isNotEmpty().isEqualTo("https://www.google.com/");

 //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        Thread.sleep(3000);
   driver.quit();

    }
}
