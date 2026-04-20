package com.rawteananya.SeleniumExceptions;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_StaleElementReferenceException extends CommonToAll {

    @Test
    public void staleElement() {

        driver = chromeBrowser("https://www.youtube.com/");

        WebElement searchbox = driver.findElement(By.name("search_query"));

        // driver.navigate().refresh(); //StaleElementReferenceException

        // to fix the StaleElementException issue : need to use try-catch

        driver.navigate().refresh();
        try {
            searchbox.sendKeys("TVS ronin" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element!!");
        }

        WebElement searchbox1 = driver.findElement(By.name("search_query"));
        searchbox1.sendKeys("TVS ronin" + Keys.ENTER);

    }
}
