package com.cyberrtek.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
 */

public class Driver {
    /*
    Singleton design pattern:
    share same object across the all class of the application
     */


    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){
        if(driver==null){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
            //To Do

            String browser = ConfigurationReader.getProperty("browser");
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }
        return driver;
    }

    /*
    driver.quit();   close all the open windows, but does not make the object
     null, we need to make the object null using the following code:
     */
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
