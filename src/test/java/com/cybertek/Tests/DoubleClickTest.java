package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends TestBase {

    @Test
    public void test(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        driver.switchTo().frame("iframeResult");


        // Create actions object
        Actions actions = new Actions(driver);
        // Indentify the webelement on which we double click

        WebElement text = driver.findElement(By.id("demo"));

        // Double click on element,
        // we need to perform() to the end of any actions
        actions.doubleClick(text).perform();

        // <p id="demo" ondblclick="myFunction()" style="color: red;"
        // >Double-click me to change my text color.</p>

        Assert.assertTrue(text.getAttribute("style").contains("red"));



        System.out.println(text.getAttribute("ondblclick"));






    }
}
