package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Action_MouseActions_SpiceJet extends CommonToAll {

    @Test
    public void Spicejet_browser(){

        driver = chromeBrowser("https://www.spicejet.com/");

        WebElement From = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions actions = new Actions(driver);

        // Move to Element
        // Click to Element
        // sendKeys
        actions.moveToElement(From).click().sendKeys("BLR").build().perform();

        WebElement To = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div"));
        actions.moveToElement(To).click().sendKeys("PUN").build().perform();
    }
}
