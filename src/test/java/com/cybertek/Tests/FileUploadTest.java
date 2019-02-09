package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void test(){

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        String path = "/Users/miradel/Downloads/test.txt";

        chooseFile.sendKeys(path);

        driver.findElement(By.id("file-submit")).click();

       // Assert.assertTrue(
        //        driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).isDisplayed());

        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class=‘example’])//h3")).isDisplayed());

        Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='example'])//h3")).getText(),"File Uploaded!");

        //*[@id="content"]/div/h3

        //*[.=‘File Uploaded!’]

        //div[@class='example']//h3
    }
}
