package com.rawteananya.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public void implicit_wait (int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    // thread sleep
    public void thread_sleep(){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
