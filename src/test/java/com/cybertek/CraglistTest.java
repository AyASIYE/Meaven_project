package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraglistTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://washingtondc.craigslist.org/");

       //driver.findElement(By.id("query")).sendKeys("corolla");

        //driver.findElement(By.linkText("electronics")).click();

        driver.findElement(By.partialLinkText("m+garden")).click();

    }
}
