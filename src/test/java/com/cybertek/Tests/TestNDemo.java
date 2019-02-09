package com.cybertek.Tests;

import org.testng.annotations.Test;

public class TestNDemo {

    /*
     In testNG/Junit, we use annotation to indicate whether the method is a test

     @Test
      */

    @Test
    public void testOne(){

        System.out.println("Hello World!");

        String  expected = "a";
        String actual = "b";

        if(expected.equals(actual))
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        /*
         this is not how you test in TestNG
          */


    }


}
