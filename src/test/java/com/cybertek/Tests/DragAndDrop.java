package com.cybertek.Tests;

import com.cyberrtek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Thread.sleep(2000);

        WebElement source = driver.findElement(By.id("draggable"));
        Thread.sleep(2000);
        WebElement target = driver.findElement(By.id("droptarget"));
        Thread.sleep(2000);

        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void test2(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droptarget"));


        // Wrrite the step for doing the drag and drop operation
        // Without using the drapanddrop() method

        actions.clickAndHold(source).moveToElement(target).release().perform();
    }

    @Test
    public void test3(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement sr = driver.findElement(By.id("draggable"));

        WebElement tr = driver.findElement(By.id("droptarget"));

        actions.dragAndDrop(sr,tr).perform();
    }
}
