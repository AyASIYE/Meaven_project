package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class TabExamles {

    /*Test case:
    go to http://the-internet.herokuapp.com/windows
    click on click "Click here"
    verify that new title is "New Window"
    verify that new title is not "The Internet"
    */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");

    }

//    @AfterMethod
//
//    public void cleanUp() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
//    }


    @Test

    public void changeTab(){
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandles());

       driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());

        Set<String> windowHandels = driver.getWindowHandles();
        System.out.println("+++++++++++++++++++++++++++++");
        for(String handle : windowHandels){
            System.out.println(handle);
            // Swtiching the tab
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if(driver.getTitle().equals("New Windows")){
                break;
            }
        }

       // change to the new tab
        Assert.assertEquals(driver.getTitle(),"New Window");
        Assert.assertNotEquals(driver.getTitle(),"The Internet");
   }


    /*Test case:
    go to http://the-internet.herokuapp.com/windows
    click on click "Click here"
    verify that new title is "New Window"
    verify that new title is not "The Internet"
    */
    @Test
    public void redoAbove(){
        System.out.println(driver.getWindowHandles().size());
        System.out.println(driver.getWindowHandle());

        driver.findElement(By.linkText("Elemental Selenium")).click();
        System.out.println(driver.getWindowHandles().size());

        Set<String> WinHandle = driver.getWindowHandles();
        for(String handle : WinHandle){

            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());

            if(driver.getTitle().equals("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"))
                break;

        }
        Assert.assertEquals(driver.getTitle(),"Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");
        Assert.assertNotEquals(driver.getTitle(),"The Internet");






    }



    @Test
    public void changeTab2(){
        driver.get("https://www.w3schools.com/html/");
        driver.findElement(By.linkText("Try it Yourself »")).click();

        // title of the second Tryit Editor V3.6
        // get all handel
        // Switch 1 by 1
        // if the title is the right, break the loop

        for(String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
            if(driver.getTitle().equals("Tryit Editor v3.6")){
                break;
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("default"));


        System.out.println(driver.getWindowHandles().size());
        driver.close();

        System.out.println(driver.getWindowHandles().size());


    }
}
