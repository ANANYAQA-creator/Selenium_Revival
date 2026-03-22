package com.rawteananya.ex02_SeleniumBasic;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium09_ChangeDriver {

    @Description("Verify the change in Driver")
    @Test
    public void changeDriver(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver = new EdgeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
