package com.rawteananya.ex03_Selenium_OptionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lab01_Selenium_optionClass {

    public static void main(String[]args){

        ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--window-size=800,600");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
