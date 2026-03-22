package com.rawteananya.ex02_SeleniumBasic;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium03_WebdriverHierarchy {

    public static void main(String[] args) {
        // WebDriver Hierarchy

        // 1. SearchContext[Interfaces] : findElements() and find Element()
        // 2. WebDriver [Interface] :  get(string url), close(),quit(),getWindowHandle()
        // 3. RemoteWebdriver[class]
        // 4. Drivers [Chrromium/chrome, Firefox, Safari, Edge, IE]


        //GGF = * SEARCH CONTEXT[INTERFACE] : findElement() and findElements()
        //GF =  * WEBDRIVER INTERFACE : some incomplete functions [ get(string url), close(), quit(), getWindowHandle()]
        //F = * REMOTE WEB DRIVER : class = it has some function
        //S = * Driver : Chromedriver,Edgedriver,Firefoxdriver,IEdriver

        // Chromium is open source project which is basically a browser engine.


        // *SEARCH CONTEXT*
        //SearchContext driver = new EdgeDriver();
       // driver.findElements("q");
       // driver.findElements("q")
        //SearchContext driver1 = new EdgeDriver();
        //SearchContext driver2 = new FirefoxDriver();

        // *WEBDRIVER*
       // WebDriver driver = new ChromeDriver();
    // driver.get();
    // driver.quit();
    // driver.close();

        // *REMOTE WEBDRIVER*

        //RemoteWebDriver  driver = new ChromeDriver();
        //driver.get();

        // *Driver*

        //ChromeDriver driver = new ChromeDriver();
        //driver.get();

      //  FirefoxDriver fdriver = new FirefoxDriver();
       // fdriver.get();

        // SCENARIOS  : in which condition you can use the above

        // 1. Do you want to run on CHROME or EDGE ? [2-3%]

        //ChromeDriver driver = new ChromeDriver();
        //driver.get();
       // driver = new EdgeDriver();   // not possible to change driver


        // 2. Do you want to run on CHROME then change to EDGE ? [97%]

      //  @Test
      //  public void OpenDifferentBrowser() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver = new EdgeDriver();
            driver.get("https://www.youtube.com");

        }
        // 3. Do you want to run on multiple browser or aws machine ? 2%
  //  RemoteWebDriver driver [with GRID]  :- advance

}
//}