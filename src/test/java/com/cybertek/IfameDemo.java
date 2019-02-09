package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IfameDemo {

    @Test

    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/tinymce");

        // Locate the irame
        //  frame/frame: they are used to put one html document inside another html document.
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

        // Switch to iFrame
        driver.switchTo().frame(iframe);


        driver.findElement(By.tagName("body")).sendKeys
                ("ddeee dddedd  dd");

        driver.switchTo().parentFrame();

        // Elemental Selenium
        driver.findElement(By.linkText("Elemental Selenium")).click();


    }
}
