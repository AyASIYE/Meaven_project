package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class mixedUpDependecy {

    @Test
    public void openBrowser(){
        System.out.println("Opening browser");
    }

    @Test(dependsOnMethods = "openBrowser")
    public void login(){
        System.out.println("login");

    }

    @AfterMethod
    private void cleanUp(){
        System.out.println("Colse browser");
    }
}
