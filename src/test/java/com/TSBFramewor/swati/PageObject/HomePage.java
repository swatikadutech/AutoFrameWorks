package com.TSBFramewor.swati.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver webDriver;
    @FindBy(id = "SiteHeader_SiteTabs_sellLink")
    WebElement loginbutton;
    @FindBy(linkText = "Computers")
    WebElement linktoComputerMenu;
    @FindBy(id = "LoginLink")
    WebElement btnLogin;

    public HomePage(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void GotoLogin() {
        loginbutton.click();
    }

    public void ClickonComputers() {
        linktoComputerMenu.click();
    }

    public void Clickonsell() {
        btnLogin.click();
    }

}
