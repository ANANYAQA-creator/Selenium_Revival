package com.rawteananya.SeleniumProject3;

import com.rawteananya.utils.CommontoALL;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class InvokeChromeBrowser extends CommontoALL {

    @Test
    public void OpenBrowser() {

        // Using Chrome Options here to invoke in incognito mode

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        chromeBrowser("https://www.youtube.com/");

        // Search box
        WebElement searchbox = driver.findElement(By.name("search_query"));
        searchbox.sendKeys("TVS Ronin 225 ");
        searchbox.sendKeys(Keys.ENTER);

        // close the browser
        closeBrowser();
    }
}