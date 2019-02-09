package com.cybertek.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class departmentTest {
    WebDriver driver;

    Select allDepartment;
    @BeforeMethod
    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://amazon.com");
    }

    @Test(priority = 0)
    public void testDefaultValue(){
        WebElement selectElement = driver.findElement(By.id("searchDropdownBox"));

        // create selcet class object
        Select allDepartment = new Select(selectElement);

        // Get the current selected option


        String selectedOption = allDepartment.getFirstSelectedOption().getText();

        // TODO Skipping because failling

        Assert.assertEquals(selectedOption,"All");
    }

    @Test(priority = 1)
    public void sortAlphabetical() {
//        for(WebElement option : allDepartment.getOptions()){
//            System.out.println(option.getText());
//        }

        for (int i = 0; i < allDepartment.getOptions().size() - 1; i++) {

            String current = allDepartment.getOptions().get(i).getText();
            String next = allDepartment.getOptions().get(i + 1).getText();
            System.out.println("Comparing" + current + " with " + next);

            Assert.assertTrue(current.compareTo(next) <= 0);
        }
    }

        @Test
        public void mainDepartmentTest(){
            driver.findElement(By.id(""));
        }

        @AfterClass
                public void sdad(){

        }


}
