package com.rawteananya.SeleniumExceptions;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_TimeOutException extends CommonToAll{

        @Test
        public void staleElement() {

            driver = chromeBrowser("https://www.youtube.com/");
            WaitHelper waitHelper = new WaitHelper(driver);

            WebElement searchbox = waitHelper.waitforElementVisible(By.id("test"));  //TimeoutException

            // to resolve this using try catch and giving the correct element id

        }
    }

