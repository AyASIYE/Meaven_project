package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {

    /*
    scrolling:
                1. actions.moveTo(element)
                2. actions.sendKeys(Keys.PAGE_DOWN)
     */

    @Test
    public void test(){
        driver.get("https://www.amazon.com/");

        WebElement sigIn = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));

        actions.moveToElement(sigIn).perform();

        driver.findElement(By.xpath("//span[.='Your Hearts']")).click();

        Assert.assertTrue(driver.getTitle().contains("Interesting"));


    }

    @Test
    public void test2(){

        driver.get("https://www.amazon.com/");

        WebElement help = driver.findElement(By.xpath("(//a[.='Help'])[2]"));

        actions.moveToElement(help).perform();



    }

}
