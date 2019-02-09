package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftSeertionExample {
    /*
    In TestNG/Junit, in any test, if any assertion fails, the rest of the method will be
    skipped.

     SoftAssert is a class that comes from testNg, it allows doing soft assertions, meaning if
     something fails, it will not stop the execution.

     HOW TO USE:
    we create a variable of type SoftAssert. SoftAssert has assertions methods.
    we call as many assertion method from SoftAssert as we want at then the end of the test,
     we call softAssert.assertAll(); which reports all the failures.
    */

    @Test
    public void test1(){
        System.out.println("Starting");

        Assert.assertTrue(false);

        System.out.println("Done");
    }

    @Test
    public void test2(){
        SoftAssert softAssert = new SoftAssert();
        // SoftAssert is a class that comes from testng,

        System.out.println("Starting");

        softAssert.assertTrue(true);

       // softAssert.assertEquals("google","goog");

        softAssert.assertEquals(1,1);

        System.out.println("Done");

        softAssert.assertAll();

        System.out.println("really");
    }

    @Test
    public void test3(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Starting");
        softAssert.assertTrue(true);

        Assert.assertTrue(false);
        System.out.println("Done");

        softAssert.assertTrue(true);

        System.out.println("Done222");

        softAssert.assertAll();
    }
}
