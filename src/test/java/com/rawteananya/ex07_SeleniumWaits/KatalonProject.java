package com.rawteananya.ex07_SeleniumWaits;

import com.rawteananya.utils.CommontoALL;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KatalonProject extends CommontoALL {

    @Description("Verify the texy of Make Appointment in KATALON website" )
    @Test
    public void open_katalon (){

        driver = firefoxBrowser("https://katalon-demo-cura.herokuapp.com/");

        WaitHelper waitHelper = new WaitHelper(driver);

        // Make appointment box click
        WebElement make_appointment = waitHelper.waitforElementClickable(By.cssSelector("#btn-make-appointment"));
        make_appointment.click();

        // usernamebox
        WebElement username_box = waitHelper.waitforElementVisible(By.xpath("//input[@id='txt-username']"));
        username_box.sendKeys("John Doe");

        // userpassword box
        WebElement password_box = waitHelper.waitforElementVisible(By.xpath("//input[@id=\"txt-password\"]"));
        password_box.sendKeys("ThisIsNotAPassword");

        //login button
        WebElement login_button = waitHelper.waitforElementClickable(By.cssSelector("#btn-login"));
        login_button.click();

        // Validation of Make Appointment text

        WebElement makeAppointment_text = waitHelper.waitforElementVisible(By.cssSelector("//h2[text()=\"Make Appointment\"]"));
        Assert.assertEquals(makeAppointment_text.getText(),"Make Appointment");
        Assert.assertTrue(makeAppointment_text.isDisplayed());

        quitBrowser();
    }
}
