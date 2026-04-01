package com.rawteananya.ex02_SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestSelenium06_SeleniumCommands {

    public static void main(String[] args){

        //gettitle, getCurrentURL and getPageSource

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"YouTube");
        driver.quit();
    }
}
