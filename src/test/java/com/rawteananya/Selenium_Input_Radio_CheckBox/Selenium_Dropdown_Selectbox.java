package com.rawteananya.Selenium_Input_Radio_CheckBox;
import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_Dropdown_Selectbox extends CommonToAll {

    @Test
    public void dropdown_selectbox(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //Select Box : Simple dropdown

        WebElement selectbox = driver.findElement(By.id("dropdown"));

        // Using select class
        Select select = new Select(selectbox);
        select.selectByVisibleText("Option 2");




    }

}
