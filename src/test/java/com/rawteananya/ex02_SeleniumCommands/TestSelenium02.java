package com.rawteananya.ex02_SeleniumCommands;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium02 {

    @Test
    public void openFacebook(){

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.facebook.com");
        firefoxDriver.close();
    }
}
