package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtcyExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");

        WebElement input = driver.findElement(By.id("search-query"));

        input.sendKeys("decal");

        WebElement submit = driver.findElement
                (By.id("//button[@class='btn btn-primary']"));

        submit.click();


    }
}
