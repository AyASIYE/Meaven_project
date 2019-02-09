package com.cybertek.Tests;

import com.cyberrtek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class explicitWait2 {
    @Test
    public void test(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        Driver.getDriver().findElement(By.tagName("button")).click();

        WebElement text = Driver.getDriver().findElement(By.xpath("//*[@id=\"finish\"]/h4"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        wait.until(ExpectedConditions.visibilityOf(text));


        System.out.println(text.getText());

        // Solution 2
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        Assert.assertTrue(text.isDisplayed());

    }

    @Test
    public void test2(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        Driver.getDriver().findElement(By.tagName("button")).click();

        WebElement text = Driver.getDriver().findElement(By.xpath("//*[@id=\"finish\"]/h4"));


        // TODO wait until Loading message disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[.='Loading... ']")));


        System.out.println(text.getText());
        Assert.assertTrue(text.isDisplayed());


    }
}
