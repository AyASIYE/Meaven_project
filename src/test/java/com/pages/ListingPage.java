package com.pages;

import com.cyberrtek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {
    public ListingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "dadasdas")
    public WebElement address;


    @FindBy(xpath = "dasdasd")
    public WebElement agent;

    @FindBy(xpath = "dasdfas")
    public WebElement map;

}
