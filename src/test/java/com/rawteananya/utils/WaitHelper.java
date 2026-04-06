package com.rawteananya.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

        // Explicit wait
        private WebDriver driver;
        private WebDriverWait explicit_wait;

        // Constructor
    public WaitHelper(WebDriver driver) {
            this.driver = driver;
            this.explicit_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        // ---------------------EXPLICIT WAIT--------------------------------

        // Visibility of Element Located
        public WebElement waitforElementVisible (By locator){
            return explicit_wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        // Element to be clickable

        public WebElement waitforElementClickable (By locator){
            return explicit_wait.until(ExpectedConditions.elementToBeClickable(locator));
        }




        // Implicit Wait

    public void implicit_wait (int time){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }

    // thread sleep
    public void thread_sleep(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

        // Fluent wait

        public WebElement fluentwaitForElement(By locator, int timeout,int pollingTime){

        Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeout))
                    .pollingEvery(Duration.ofSeconds(pollingTime))
                    .ignoring(NoSuchElementException.class);

        return wait.until(driver ->driver.findElement(locator));

    }

    // Fluent Wait for visibility of Element

    public WebElement fluentWaitForVisibility(By locator,int timeout,int pollingTime){

        Wait<WebDriver> wait = new FluentWait<> (driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }



}
