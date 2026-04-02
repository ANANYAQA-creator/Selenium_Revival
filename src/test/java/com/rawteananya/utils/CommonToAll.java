package com.rawteananya.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonToAll {

    public WebDriver driver;

    // Chrome Browser
    public WebDriver chromeBrowser(String url){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    // Firefox Browser
    public WebDriver firefoxBrowser(String url){
        driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    // Edge Browser
    public WebDriver edgeBrowser(String url){
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    // IE Browser

    public WebDriver ieBrowser(String url){
        driver = new InternetExplorerDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    // close browser

    public void closeBrowser(){
        if(driver != null){
            driver.close();
        }

    }

    // Quit Browser

    public void quitBrowser(){
       if(driver != null){
           driver.quit();
       }

    }

}
