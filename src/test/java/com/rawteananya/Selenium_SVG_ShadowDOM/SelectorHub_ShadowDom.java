package com.rawteananya.Selenium_SVG_ShadowDOM;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectorHub_ShadowDom extends CommonToAll {

    @Test

    public void selectorHub() {
        driver = chromeBrowser("https://selectorshub.com/xpath-practice-page/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement pizzaName = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector(\"#pizza\")");
        pizzaName.sendKeys("Onion + Farmhouse");

    }
}
