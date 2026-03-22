package com.rawteananya.ex02_SeleniumBasic;

import io.qameta.allure.Description;
import net.bytebuddy.build.Plugin;
import org.apache.logging.log4j.core.net.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_Close_Quit {

    @Description("Verify the close of browser")
    @Test

    public void closeBrowser(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }

    @Description("Verify to quit the browser")
    @Test
    public void  QuitBrowser (){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Open new tab

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().refresh();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
