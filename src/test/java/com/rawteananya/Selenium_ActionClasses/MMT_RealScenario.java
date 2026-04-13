package com.rawteananya.Selenium_ActionClasses;

import com.rawteananya.utils.CommonToAll;
import com.rawteananya.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class MMT_RealScenario extends CommonToAll {


    @Test
    public void openMMT(){

        driver = firefoxBrowser("https://www.makemytrip.com/");

        WaitHelper waitHelper = new WaitHelper(driver);

        // Close modal

       WebElement closeModal= waitHelper.waitforElementVisible(By.className("commonModal__close"));
       closeModal.click();

       //Another ai modal close
        WebElement aiModal = waitHelper.waitforElementVisible(By.xpath("//div[@class='tp-dt-header-icon']/img[@alt='minimize']"));
        aiModal.click();

        // From inputbox

        Actions actions = new Actions(driver);

        WebElement fromContainer = waitHelper.waitforElementVisible(By.xpath("//input[@data-cy='fromCity']"));
        actions.moveToElement(fromContainer).click().build().perform();
        WebElement fromInputBox = waitHelper.waitforElementVisible(By.xpath("//input[@placeholder='From']"));
        actions.moveToElement(fromInputBox).sendKeys("PNQ").build().perform();


        List<WebElement> fromList = waitHelper.visibileAllElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

            for ( WebElement e : fromList) {
                if(e.getText().contains("Pune")){
                    e.click();
                    break;
                }
            }


            WebElement toContainer = waitHelper.waitforElementVisible(By.xpath("//input[@id='toCity']"));
            actions.moveToElement(toContainer).click().build().perform();
        WebElement toInputBox = waitHelper.waitforElementVisible(By.xpath("//input[@placeholder='To']"));
        actions.moveToElement(toInputBox).sendKeys("MYQ").build().perform();

        waitHelper.waitforElementVisible(
                By.xpath("//li[contains(.,'Mysore')]")).click();
    }
}
