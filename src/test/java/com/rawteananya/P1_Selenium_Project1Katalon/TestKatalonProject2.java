package com.rawteananya.P1_Selenium_Project1Katalon;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestKatalonProject2 {

    @Description("Verify the title of Cura Health Service")
    @Test
    public void OpenKatalon(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        // Verify with assert

        if (driver.getPageSource().contains("CURA Healthcare Services")) {
            System.out.println("TestCase Passed");
            Assert.assertTrue(true);
        } else {
            System.out.println("TestCase Failed");
            Assert.fail();
        }

        driver.quit();
    }
}
