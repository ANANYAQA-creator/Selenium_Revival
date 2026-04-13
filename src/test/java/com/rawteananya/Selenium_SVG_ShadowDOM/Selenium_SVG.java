package com.rawteananya.Selenium_SVG_ShadowDOM;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium_SVG extends CommonToAll {

    @Test

    public void flipkartSearchSVG() {

        driver = firefoxBrowser("https://www.flipkart.com/search");

        // Searchbox

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("macmini");

        // Search SVG
        List<WebElement> svgSearch = driver.findElements(By.xpath("//*[name()='svg']"));
        svgSearch.get(0).click();

    }
}