package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Action_Keyboard_Actions extends CommonToAll {

    @Test
    public void keyboardAction(){

        driver = firefoxBrowser("https://awesomeqa.com/practice.html");

        Actions actions = new Actions(driver);

        WaitHelper waitHelper = new WaitHelper(driver);
        WebElement fnameBox = waitHelper.waitforElementVisible(By.name("firstname"));

        actions.keyDown(Keys.SHIFT).sendKeys(fnameBox," i am shiv").keyUp(Keys.SHIFT).build().perform();

    }
}
