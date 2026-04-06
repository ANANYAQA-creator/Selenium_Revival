package com.rawteananya.Selenium_Input_Radio_CheckBox;

import com.rawteananya.utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_Input_Radio_CheckBox extends CommonToAll
{

    @Description("How to handle Input Box ? ")
    @Test
    public void InputBoxHTMLPage() {

        driver = chromeBrowser("https://awesomeqa.com/practice.html");

        // Input Box

        // firstnamebox
        WebElement firstname_Inputbox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname_Inputbox.sendKeys("ANANYA");

        // lastnamebox
        WebElement lastname_Inputbox = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname_Inputbox.sendKeys("RAWTE");


        // Radio Button

        // Gender Radio Button
        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@id='sex-0']"));
        genderRadioButton.click();

        // YEO Radio Button
        WebElement yeoRadiobutton = driver.findElement(By.xpath("//input[@id='exp-2']"));
        yeoRadiobutton.click();


        // CheckBox
        // Profession checkbox
        WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
        profession.click();

        // Automation Tool checkbox
        WebElement Automationtools = driver.findElement(By.xpath("//input[@id='tool-2']"));
        Automationtools.click();

        //DropDown
        // How to handle simple dropdown

        // Continents dropdown

        WebElement continent = driver.findElement(By.id("continents"));
        Select select = new Select(continent);
        select.selectByVisibleText("Australia");

        //Selenium Commands dropdown

        WebElement selenium_commands_dropdown = driver.findElement(By.id("selenium_commands"));
        Select select1 = new Select(selenium_commands_dropdown);
        select1.selectByIndex(2);   // Switch commands




    }
}
