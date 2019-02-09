package com.cybertek.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DiffrentAnnotstion2 {

    @Test

    public void testOne(){
        System.out.println("This is test one");
    }
    @Test
    public void testTwo(){
        System.out.println("This is test two");
    }

        @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
       // driver = new ChromeDriver();
       // System.out.println("Go to website and log in");
      //  driver.get("http://google.com")
    }

    @AfterClass

    public void afterClass(){
        System.out.println("This is After Class");
    }

}
