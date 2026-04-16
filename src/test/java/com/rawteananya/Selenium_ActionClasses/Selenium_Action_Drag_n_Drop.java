package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Action_Drag_n_Drop extends CommonToAll {

    @Test
    public void drag_drop(){

        driver = chromeBrowser("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement boxA = driver.findElement(By.id("column-a"));
        WebElement boxB = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(boxA,boxB).build().perform();

    }
}
