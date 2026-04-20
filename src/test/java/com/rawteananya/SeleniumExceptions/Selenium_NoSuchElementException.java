package com.rawteananya.SeleniumExceptions;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Selenium_NoSuchElementException extends CommonToAll {

    @Test
    public void NoSuchElementException(){

        driver = chromeBrowser("https://app.vwo.com/#/login");

     //   driver.findElement(By.id("test")); //NoSuchElementException

       // to fix this NoSuchElementException we need to add try-catch

        try {
            driver.findElement(By.id("test"));
        } catch (NoSuchElementException e){
            System.out.println("Element not found!");
        }
    }
}
