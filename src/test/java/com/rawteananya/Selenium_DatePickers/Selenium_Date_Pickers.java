package com.rawteananya.Selenium_DatePickers;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Date_Pickers extends CommonToAll {

    @Test
    public void Redbus_calendar (){

        driver = chromeBrowser("https://www.redbus.com/");

        Actions actions = new Actions(driver);

        WebElement sourceBox = driver.findElement(By.xpath("//div[@class='source input-box ']/div/div"));
        actions.moveToElement(sourceBox).click().sendKeys("Pune");

        WebElement destinationBox = driver.findElement(By.xpath("//div[@class='destination input-box']/div/div"));
        actions.moveToElement(destinationBox).click().sendKeys("Gondia").build().perform();


        WebElement fromDateBox = driver.findElement(By.xpath("//div[@class='date input-box ']/div"));
        fromDateBox.click();


    }
}
