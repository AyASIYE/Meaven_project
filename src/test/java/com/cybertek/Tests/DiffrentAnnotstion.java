package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DiffrentAnnotstion {
    //WebDriver driver;



    @Test

    public void testOne(){
        System.out.println("This is test one");
    }
    @Test
    public void testTwo(){
        System.out.println("This is test two");
    }

    /*
    @BeforeMethod run one time before other @Test methods,
    if we have one @Test
     */


    @BeforeClass  // run only ome times before class
    public void beforeClass(){
        System.out.println("This is before class");
        // WebDriverManager.chromedriver().setup();
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");

    }



//    @AfterMethod
//    public void afterMethod(){
//      //  System.out.println("Opeining browthere");
//       // driver = new ChromeDriver();
//       // System.out.println("Go to website and log in");
//      //  driver.get("http://google.com");
//
//    }

//    @AfterClass
//    public void afterClass(){
//        System.out.println("After Class");
//    }

//    @BeforeMethod
//    public void setUpMethod(){
//        System.out.println("This is before methods");
//       // System.out.println("Go to website and login");
//    }

//    @Test
//    public void testOnee(){
//        System.out.println("Testing Testing Testing");
//    }

}
