package com.TSBFramewor.swati.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPage {
    WebDriver webDriver;
    @FindBy(id = "SiteHeader_SiteTabs_sellLink")
    WebElement sellLink;
    @FindBy(id = "SiteHeader_SiteTabs_sellGeneralItem")
    WebElement generalItem;
    public SellPage(WebDriver driver) {
        webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnSell() {
        sellLink.click();
    }

    public void ClickOnGenerealITem() {
        generalItem.click();

    }


}
