package com.rawteananya.P3_SeleniumProject3_Linktext_PartialLink_InvokeBrowser;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InvokeChromeBrowser extends CommonToAll {

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