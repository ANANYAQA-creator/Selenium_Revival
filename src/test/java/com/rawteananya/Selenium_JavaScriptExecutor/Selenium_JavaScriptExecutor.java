package com.rawteananya.Selenium_JavaScriptExecutor;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium_JavaScriptExecutor extends CommonToAll {

    @Test
    public void jsExecutor(){

        driver = chromeBrowser("about:blank");
        // JS executor used to interact element inside the Shadow DOM

       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location= 'https://www.youtube.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();
        System.out.println(url);
        System.out.println(title);


    }
}
