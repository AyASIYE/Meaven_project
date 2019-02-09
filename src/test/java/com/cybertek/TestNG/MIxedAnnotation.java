package com.cybertek.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MIxedAnnotation {
    WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Setting up the driver in here");

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Openning a browser");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        System.out.println("Go to website and login");
        driver.get("http://google.com");
    }

    @Test
    public void test1(){
        System.out.println("Testing testing testing: account info");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Log-Out");
        System.out.println("Closing Broswer");
        driver.quit();
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Report Everthing");
    }

    @Test
    public void test2(){
        System.out.println("Testing testing testing: Payment");
    }

    @Test
    public void test3(){
        System.out.println("Testing testing testing: Test last task");
    }
}
