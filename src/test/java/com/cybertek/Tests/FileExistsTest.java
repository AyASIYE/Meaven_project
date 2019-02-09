package com.cybertek.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;

import java.nio.file.Paths;


public class FileExistsTest {

    //Purpose of this task is :   use java to verify is a file exists in certain location.
    @Test
    public void test(){
        // get the current folder location
        String currentFolder = System.getProperty("user.dir");
        System.out.println(currentFolder);

        // get the user folder
        String userFolder = System.getProperty("user.home");
        System.out.println(userFolder);

        String path = userFolder + "/Downloads/test.txt";

        System.out.println(path);


        //Assert.assertTrue(Files.exists(Paths.get(path)));

        //Assert.assertTrue(Files.exists(Paths.get(path)));

        // Files.exists(Paths.get()  : returns true if file exists in the parameter provided

        Assert.assertTrue(Files.exists(Paths.get(path)));
    }
}
