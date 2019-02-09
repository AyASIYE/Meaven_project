package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonSearch {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://Amazon.com");
         WebElement input = driver.findElement(By.id("twotabsearchtextbox"));

        // input.sendKeys("charger"+ Keys.ENTER);

         String serchTearm = "chrager";
         driver.findElement(By.id("twotabsearchtextbox")).
                 sendKeys(serchTearm+ Keys.ENTER);
        /*
         How to get tex from element ?
         1.   element.getText();
         2.   element.getAttribute();
         */
         String actual = driver.findElement(By.id("twotabsearchtextbox"))
                 .getAttribute("value");

         if(serchTearm.equals(actual)){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
         }



    }
}
