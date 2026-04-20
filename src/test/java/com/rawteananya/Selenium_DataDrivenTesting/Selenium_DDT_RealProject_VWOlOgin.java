package com.rawteananya.Selenium_DataDrivenTesting;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_DDT_RealProject_VWOlOgin extends CommonToAll {


    @Test(dataProvider = "getData")
    public void vwo_login(String email, String password) {

        // if we have more column then we can split second row[password] and keep it : recommended way
        // 1) Simple split (escape pipe)
        // String[] parts1 = password.split("\\|");
        // System.out.println("parts1[0] = '" + parts1[0] + "'");
        // System.out.println("parts1[1] = '" + parts1[1] + "'");


        driver = chromeBrowser("https://app.vwo.com/#/login");

        WebElement searchbox = driver.findElement(By.id("login-username"));
        searchbox.sendKeys(email);

        WebElement Password = driver.findElement(By.id("login-password"));
        Password.sendKeys(password);

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        WaitHelper waitHelper = new WaitHelper(driver);
        waitHelper.waitforElementVisible(By.className("notification-box-description"));

        driver.close();
    }

    @DataProvider
    public Object[][] getData() {
        return utilExcel.getTestDatafromExcel("sheet1");
    }
}
