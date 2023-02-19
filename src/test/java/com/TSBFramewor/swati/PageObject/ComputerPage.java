package com.TSBFramewor.swati.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {

    WebDriver webDriver;
    @FindBy(id = "searchString")
    WebElement searchstring;
    @FindBy(id = "LoginLink")
    WebElement btnSearch;
    public ComputerPage(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void WritesearchString(String s) {
        searchstring.sendKeys(s);
    }

    public void ClickOnseachButton() {
        btnSearch.click();
    }

}
