package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MMT_Modal extends CommonToAll {

    @Description("Verify MMT modals")
    @Test

    public void openMMT(){

        driver = chromeBrowser("https://www.makemytrip.com/");

        WaitHelper waitHelper = new WaitHelper(driver);
        WebElement close_modal= waitHelper.waitforElementVisible(By.xpath("//span[@data-cy='closeModal']"));
        close_modal.click();

        quitBrowser();
    }
}
