package com.rawteananya.Selenium_WindowHandle_Iframe_JSexecutor;

import com.rawteananya.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium_WindowHandle_iframe extends CommonToAll {

    @Description("Verify the window handling and frame")
    @Test
    public void windowHandle(){

        driver = chromeBrowser("http://the-internet.herokuapp.com/windows");

        String parent_window = driver.getWindowHandle();
        System.out.println(parent_window);

        WebElement clickHereButton = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
        clickHereButton.click();

        // using window handle

        Set<String> allWindowsHandle = driver.getWindowHandles();

        // Method 1:
     /*   for ( String windowHandles : allWindowsHandle){
            driver.switchTo().window(windowHandles);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Testcase passed");
            }
        }
*/

       // Method2 :

        for (String windowHandle : allWindowsHandle){
            if (!parent_window.equals(windowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }

        WebElement newWindow_text = driver.findElement(By.xpath("//h3[text()='New Window']"));
        String newWindowText=  newWindow_text.getText();
        System.out.println(newWindowText);

        Assert.assertEquals(newWindowText,"New Window");

    }
}
