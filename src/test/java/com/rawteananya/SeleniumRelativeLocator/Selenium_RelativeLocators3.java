package com.rawteananya.SeleniumRelativeLocator;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium_RelativeLocators3 extends CommonToAll {

        @Test
        public void AQI(){

           driver = chromeBrowser ("https://www.aqi.in/real-time-most-polluted-city-ranking");

            WaitHelper waitHelper = new WaitHelper(driver);

            // Modals

            WebElement modal = waitHelper.waitforElementVisible(By.xpath("//*[local-name()='svg']//*[local-name()='path' and contains(@d,'19.7076')]"));
            modal.click();

            // Search Box
            WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
            searchbox.sendKeys("india" + Keys.ENTER);

            waitHelper.thread_sleep(5000);

            // Find Locations
            List<WebElement> locations = driver.findElements(By.xpath("//p[@class=\"b\"]/span"));
            for (WebElement location : locations){
                String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
                String AQI = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();
                System.out.println(  "| +" + rank + "|" + location.getText() + "|" + AQI + "|");
            }
        }
    }

