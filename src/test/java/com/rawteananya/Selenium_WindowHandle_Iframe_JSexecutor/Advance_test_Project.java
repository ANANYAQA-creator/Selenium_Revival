package com.rawteananya.Selenium_WindowHandle_Iframe_JSexecutor;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class Advance_test_Project extends CommonToAll {

    @Description("Verify the window Handle and frame")

    @Test
    public void test_interview_vwo_project() {

        WaitHelper waitHelper = new WaitHelper(driver);
        driver = chromeBrowser("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");

        waitHelper.thread_sleep(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindowHandle);

        WebElement url_input = driver.findElement(By.name("primaryUrl"));
        url_input.clear();
        url_input.sendKeys("https://thetestingacademy.com");

        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=\" View Heatmap \"]"));
        view_heatmap.click();

        waitHelper.thread_sleep(10000);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);


        for (String handle : allHandles) {
            if (!handle.equals(parentWindowHandle)) {

                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                waitHelper.thread_sleep(20000);

                // System.out.println(driver.getPageSource());

                WebElement navigate_button = driver.findElement(By.xpath("//span[text()=\"Compare\"]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(navigate_button).click().build().perform();

            }
        }
    }}
