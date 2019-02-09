package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoggleDemo extends TestBase {
    /*
    open chrome
    go to google
    search for selenium cookbook
    verify title contains the search term
     */




    @Test
    public void titleTest(){
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys
                ("selenium cookbook"+ Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("selenium cookbook"));
    }

    @Test
    public void test2(){
        driver.get("https://amazon.ca");
        driver.findElement(By.name("field-keywords")).
                sendKeys("The 10x Rule"+Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("The 10x Rule"));
    }
}
