package com.rawteananya.ex05_Selenium_SVG_elements;

import com.rawteananya.utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Objects;

public class SVGElementMaps extends CommonToAll {

    @Test
    public void svg_maps(){

        driver = firefoxBrowser("https://www.amcharts.com/svg-maps/?map=india");
        Actions actions = new Actions(driver);
        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement s : states){
            System.out.println(s.getAttribute("aria-label"));
            if(Objects.equals(s.getAttribute("aria-label"), "Tripura  ")){
                actions.moveToElement(s).click().perform();
                break;
            }
        }



    }
}
