package com.rawteananya.Listeners;

import com.rawteananya.BaseClass.Base;
import com.rawteananya.utils.Screenshotutils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{


    public void onTestFailure (ITestResult result){
        WebDriver driver = ((Base) result.getInstance()).driver;

        String test_name = result.getName();

        if(driver != null) {
            String path = Screenshotutils.capture(driver, test_name + "_FAILED");
            System.out.println("FAILED : " + test_name);
            System.out.println("Screenshot" + path);

            driver.quit();
        }

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        WebDriver driver = ((Base) result.getInstance()).driver;

        String testName = result.getName();

        if(driver!=null) {
            String path = Screenshotutils.capture(driver, testName + "_PASSED");
            System.out.println("Passed: " + testName);
            System.out.println("Screenshot: " + path);

            driver.quit();
        }
    }
}

