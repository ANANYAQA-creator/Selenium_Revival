package com.rawteananya.ex02_SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium07_Maximize_Minimize {

@Test
//    public static void main(String[] args){

    public void BrowserMaximize () {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    driver.close();

}

@Test
    public void BrowserMinimize(){

    WebDriver driver = new EdgeDriver();
    driver.get("https://www.google.com");
    driver.manage().window().minimize();
    driver.quit();
}

}
