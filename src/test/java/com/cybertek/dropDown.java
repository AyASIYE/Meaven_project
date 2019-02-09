package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement selectElement = driver.findElement(By.id("dropdown"));

        Select list = new Select(selectElement);

        // print the selected option
        String selectedOption = list.getFirstSelectedOption().getText();
        System.out.println(selectedOption);

        // print all availabe options
        List<WebElement> options = list.getOptions();
        System.out.println("option.siz() = "+ options.size());

        for(WebElement option : options){
            System.out.println(option);
        }

        // select different options
        // 1. by visible text

        list.selectByVisibleText("Option 2");
        System.out.println("Selected option" +
                list.getFirstSelectedOption().getText());

        // 2.by visible index; count is 0 based

        list.selectByIndex(2);
        System.out.println("Selected option: " +
                list.getFirstSelectedOption().getText());

        // 3. by value attribute

        list.selectByValue("1");
        System.out.println("Seleted options:  " +
                list.getFirstSelectedOption().getText());







    }
}
