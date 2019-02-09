package com.cybertek.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
    @Test
    public void test1 () {

        String a = "A";
        String b = "A";
        /*
        TestNg assertions ; method for asserting/verify. All the assertions are provide in the
         asseert class.
         */

        Assert.assertEquals(a, b); // comparing a to b


    }
        @Test
        public void test2 (){

            String a = "A";
            String b = "AAA";

            Assert.assertEquals(a,b);
    }
    @Test
    public void test3(){
//        boolean b = 1==1;
//        Assert.assertTrue(b);

//        WebElement elmenrt = null;
//        Assert.assertTrue(elmenrt.isSelected());
        String a = "Ae";
        String b = "AAA";

        Assert.assertTrue(b.contains(a));
        // Line 43 run only when assertion is true

        System.out.println("Done");

    }


    @Test
    public void test4 (){
        String a = "AD";
        String b = "AAAA";

        Assert.assertTrue(b.contains(a),b +" b should have "+a);
    }

    @Test
    public  void test5(){
        Assert.assertTrue(false);
    }
}
