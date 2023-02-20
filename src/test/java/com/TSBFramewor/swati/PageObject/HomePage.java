package com.TSBFramewor.swati.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage {

    WebDriver webDriver;
    @FindBy(xpath = "//a[@id='LoginLink']")
    WebElement loginbutton;
    @FindBy(linkText = "Computers")
    WebElement linktoComputerMenu;

    //@FindBy()


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
      //  btnLogin.click();
    }

}
