package com.rawteananya.Selenium_Input_Radio_CheckBox.JavaScriptAlert;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_JavaScriptAlert_sendKeys extends CommonToAll {


    @Test
    public void jsPrompt(){


        // JS Prompt = //button[text()='Click for JS Prompt']
        // Result = //p[@id='result']


        driver = chromeBrowser("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPrompt.click();
        Alert jsPromptAlert = driver.switchTo().alert();

       // jsPromptAlert.sendKeys("I am Shiv");

      //  using dynamic test

        String name = "I am shiv" ;
        jsPromptAlert.sendKeys(name);
        jsPromptAlert.accept();
       // jsPromptAlert.dismiss();

        WebElement result_msg = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(result_msg.getText());
     //   Assert.assertEquals(result_msg.getText(),"You entered: I am Shiv");
        Assert.assertEquals(result_msg.getText(),"You entered: "+ name);
    }

}
