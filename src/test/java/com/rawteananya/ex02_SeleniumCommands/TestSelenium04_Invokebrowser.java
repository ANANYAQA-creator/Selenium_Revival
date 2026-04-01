package com.rawteananya.ex02_SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class TestSelenium04_Invokebrowser {
    public static void main(String[]args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.quit();
    }
}
