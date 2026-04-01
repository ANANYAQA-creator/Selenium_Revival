package com.rawteananya.Selenium_SVG_elements;

import com.rawteananya.utils.CommontoALL;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SVG_Elements_Flipkart extends CommontoALL {

    @Description("Learning SVG Elements")
    @Test
    public void flipkart_svg_element(){

        driver = chromeBrowser("https://www.flipkart.com/");

        // Waithelper

        WaitHelper waitHelper = new WaitHelper(driver);
        // 1. Close login popup FIRST
        WebElement login_cancel = waitHelper.waitforElementClickable(
                By.xpath("//span[text()='✕']")
        );
        login_cancel.click();

        // Searchbox
        WebElement searchbox = waitHelper.waitforElementVisible(By.xpath("//input[@name='q' and not(@readonly)]"));
        searchbox.sendKeys("iphone");

        //Click on search button
        WebElement searchbutton = waitHelper.waitforElementClickable(By.xpath("//button//*[local-name()='svg']"));
        searchbutton.click();
    }
}
