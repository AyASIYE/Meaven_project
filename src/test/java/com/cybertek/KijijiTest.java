package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KijijiTest {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://kijiji.ca");
   //driver.findElement(By.id("SearchKeyword")).sendKeys("room for rent"+ Keys.ENTER);
      //  driver.findElement(By.linkText("Houses for Sale")).click();

        driver.findElement(By.partialLinkText("Condos for s")).click();
    }
}
