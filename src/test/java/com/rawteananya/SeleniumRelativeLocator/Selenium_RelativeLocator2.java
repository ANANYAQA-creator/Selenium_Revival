package com.rawteananya.SeleniumRelativeLocator;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium_RelativeLocator2 extends CommonToAll {

    @Test
    public void rl(){

        driver = chromeBrowser("https://awesomeqa.com/practice.html");
        WebElement YEO = driver.findElement(RelativeBy.xpath("//span[text()='Years of Experience']"));

        // Relative Locator
      driver.findElement(with(RelativeBy.id("exp-1")).toRightOf(YEO)).click();

    }
}
