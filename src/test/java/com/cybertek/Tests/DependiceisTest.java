package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependiceisTest {

    @Test
    public void login(){
        System.out.println("login");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")
    public void zbuySth(){
        System.out.println("Buy Buy Buy");
    }

    @Test(priority = 5)
    public void homePage(){
        System.out.println("Home Page");
    }
}
