package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Selenium_FluentWait_Syntax extends CommonToAll {

    //Fluent wait syntax :
    Wait<WebDriver> wait =  new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(10))                              // max wait time
            .pollingEvery(Duration.ofSeconds(2))                      // checking in every 2 second
            .ignoring(NoSuchElementException.class);     // ignore exception


    WebElement error_msg = wait.until(
            driver -> driver.findElement(By.xpath("")));

}
