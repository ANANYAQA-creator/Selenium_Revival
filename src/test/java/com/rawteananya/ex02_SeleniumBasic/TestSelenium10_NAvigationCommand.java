package com.rawteananya.ex02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_NAvigationCommand {

    @Description ("Open the URL using navigate command")
    @Test
    public void openURL(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.youtube.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
