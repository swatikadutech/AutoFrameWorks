package com.TSBFramewor.swati.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement usernameEmail;
    @FindBy(id = "Password")
    WebElement userPassword;
    @FindBy(id = "SignIn")
    WebElement btnLogin;


    public LoginPage(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String uname) {
        usernameEmail.sendKeys(uname);
    }

    public void setPassword(String Pword) {
        userPassword.sendKeys(Pword);
    }

    public void clicksubmit() {
        btnLogin.click();
    }


}
