package com.cybertek.Tests;

import com.cyberrtek.utilities.ConfigurationReader;
import com.cyberrtek.utilities.Driver;
import com.cyberrtek.utilities.TestBase;
import com.pages.HomePage;
import com.pages.ListingPage;
import com.pages.PrestashopHomepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationTest extends TestBase {


    @Test
    public void wrongEmailTest(){
        HomePage homePage = new HomePage();

        // driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.get(ConfigurationReader.getProperty("url"));


        homePage.username.sendKeys("admin");
        //driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
        homePage.paswoord.sendKeys("test");
        //driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        homePage.logInButtom.click();
        //driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String error = "Invalid Login or Password.";
        //String actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError,error);

    }

    @Test
    public void wrongPasswordTest(){

        HomePage homePage = new HomePage();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        homePage.username.sendKeys("Tester");
        homePage.username.sendKeys("wrong password");
        homePage.logInButtom.click();

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError,expectedError);

    }
    @Test
    public void blankUserName(){
        HomePage homePage = new HomePage();
       // driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        // use line 56 to 54 for getting to the URL
        homePage.open();

        homePage.login("","test");

        String expectedError = "Invalid Login or Password.";
        String actualError = homePage.errorMessage.getText();
        Assert.assertEquals(actualError,expectedError);

    }

    @Test
    public void test(){
        ListingPage nilesLane = new ListingPage();
        ListingPage palmetLane = new ListingPage();

        PrestashopHomepage prestashopHomepage = new PrestashopHomepage();
        WebElement tshirt = prestashopHomepage.product("tshirt");
        WebElement dress = prestashopHomepage.product("dress");

    }



}
