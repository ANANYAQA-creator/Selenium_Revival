package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_FileUpload extends CommonToAll {
    @Test
    public void fileUpload() {
        driver = chromeBrowser("https://awesomeqa.com/selenium/upload.html");

        WebElement fileUploadInput = driver.findElement(By.id("fileToUpload"));

        String UserdirectoryPath =   System.getProperty("user.dir");
        // System.getProperty give =  C:\Users\Black Panther\Desktop\Pramod Testing\Automation_Projects\Selenium_Revival
        String filePath = UserdirectoryPath+ "/src/test/java/com/rawteananya/Selenium_ActionClasses/testSeleniumFileUpload.txt";

        fileUploadInput.sendKeys(filePath);

        WebElement uploadFileSubmit = driver.findElement(By.name("submit"));
        uploadFileSubmit.click();

    }
}