package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EtsyWithSoftAssert extends TestBase {

    @Test
    public void test(){
        //SoftAssert softAssert = new SoftAssert();
        driver.get("https://etsy.com");
        driver.findElement(By.id("search-query")).sendKeys("Gift"+ Keys.ENTER);
       // softAssert.assertTrue(driver.getTitle().contains("gift"), "title did not match");

        Assert.assertTrue(driver.getTitle().contains("Gift"));

       // softAssert.assertAll();
    }
}
