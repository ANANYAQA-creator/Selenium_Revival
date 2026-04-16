package com.rawteananya.SeleniumRelativeLocator;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_Relative_Locator extends CommonToAll {

    @Test
    public void relativeLocator(){

        driver = chromeBrowser("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();

    }
}
