package com.rawteananya.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {


    protected WebDriver driver;

    // Common method for all browser

    public WebDriver initBrowser(String browser, String url) {

        switch (browser.toLowerCase()) {

            case "chrome":
              WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;


            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;


            default:
                throw new IllegalArgumentException("Invalid Browser : " + browser);

        }
        driver.manage().window().maximize();
        driver.get(url);

        return driver;
    }

        // Quit Browser
    public void quitbrowser_new(){
        if (driver != null){
            driver.quit();
        }
    }

    // Close Browser
    public void closebrowser_new(){
        if (driver != null){
            driver.close();
        }
    }
}
