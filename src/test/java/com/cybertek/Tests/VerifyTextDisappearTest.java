package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class VerifyTextDisappearTest extends TestBase {

    @Test
    public void verify1() {

        driver.get("https://www.w3schools.com/howto/howto_js_toggle_hide_show.asp");
        WebElement text = driver.findElement(By.xpath("//div[@id='myDIV']"));
        System.out.println(text.getText());

        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//*[@id=\"main\"]/button"));
        button.click();

        Assert.assertFalse(text.isDisplayed());
    }

    @Test
    public void verify2() {
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_html_remove");

        driver.switchTo().frame("iframeResult");

        WebElement text = driver.findElement(By.xpath("//body/p"));
        Assert.assertTrue(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//body/button"));
        button.click();

        Assert.assertFalse(elementDisplayedS(By.xpath("//body/p")));
    }
    /**
     * takes a locator and returns if element matching this locator exists
     *
     * @param by
     * @return
     */

    public boolean elementDisplayed(By by) {
        // try find it
        // if cant find it, return false
        try {
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean elementDisplayedS(By by) {
        // if the locator mathches the list will not be empty
        // if the locator does not match anything the list will be empty
        return !driver.findElements(by).isEmpty();
    }

}
