package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Action_Pagedown extends CommonToAll {

    @Test
    public void openYT(){

        driver = chromeBrowser("https://mppsc.mp.gov.in/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
