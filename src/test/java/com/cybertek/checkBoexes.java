package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoexes {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        /* this code will help setpropertiyes, like
        System.setProperty("webdriver.chrome.driver",
        "/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver");

         we need to go https://mvnrepository.com/  to search "webdrivermanager", then get it's dependecy then put into
         the pom file

        */


        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement input = driver.findElement(By.id("email"));

        input.sendKeys("miradel123@outlook.com" + Keys.ENTER);

        // we can use other way like this;
        /*
          input.sendKeys("miradel123@outlook.com");
         input.submit();
          */

        String expected = "Your e-mail's been sent!";

        String actual =
                driver.findElement(By.id("content")).getText();

        if (actual.equals(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
    }
}

