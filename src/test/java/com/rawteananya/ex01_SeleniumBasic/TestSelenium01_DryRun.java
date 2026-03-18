package com.rawteananya.ex01_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01_DryRun {

    @Test
    public void test_code1() {
       Assert.assertEquals("Ananya","Ananya");
    }

    @Test
    public void test_code2(){
        Assert.assertEquals("ananya","Ananya");
    }

    @Test
    public void OpenBrowser(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
    }
}
