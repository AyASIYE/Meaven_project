package com.pages;

import com.cyberrtek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement username;


    @FindBy(id="ctl00_MainContent_password")
    public WebElement paswoord;


    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement logInButtom;

    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMessage;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.paswoord.sendKeys(password);
        logInButtom.click();
    }

    public void open(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }






}
