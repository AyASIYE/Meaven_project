package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class moreDependecy {

    @Test
    public void openBrowser(){
        System.out.println("Opening browser");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void logIn(){
        System.out.println("Log in");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "logIn")
    public void logOut(){
        System.out.println("LogOut");
    }
}
