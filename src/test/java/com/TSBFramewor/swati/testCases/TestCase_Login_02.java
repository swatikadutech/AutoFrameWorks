package com.TSBFramewor.swati.testCases;

import com.TSBFramewor.swati.PageObject.BaseClass;
import com.TSBFramewor.swati.PageObject.HomePage;
import com.TSBFramewor.swati.PageObject.LoginPage;
import com.TSBFramewor.swati.utilities.ExcelDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class TestCase_Login_02 extends BaseClass {

    public TestCase_Login_02() throws FileNotFoundException {
    }

    @Test
    public void loginTest() {

        HomePage homePage = new HomePage(driver);
        driver.get(baseURl);
      //  homePage.GotoLogin();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.GotoLogin();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("opening the login page");
        LoginPage loginpage = new LoginPage(driver);
        logger.info("setting up the username");
        loginpage.setUsername(userName);
       // loginpage.setUsername(userName);
        logger.info("setting up the password");
        loginpage.setPassword(password);
        logger.info("Clicking on submit Button");
        loginpage.clicksubmit();
        System.out.println(driver.getTitle());

        if (driver.getTitle().equals("Buy online and sell with NZ's #1 auction & classifieds site | Trade Me")) {
            System.out.println(driver.getTitle());
            Assert.assertTrue(true);
            logger.info("login test pass");

        }


    }


    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void search(String keyWord1, String keyWord2) {

        WebElement txtBox = driver.findElement(By.id("sb_form_q"));
        txtBox.sendKeys(keyWord1, " ", keyWord2);
        System.out.println("Keyword entered is : " + keyWord1 + " " + keyWord2);
        txtBox.sendKeys(Keys.ENTER);
        System.out.println("Search results are displayed.");
        System.out.println("RESULT: " + driver.getTitle());
        Assert.assertTrue(driver.getPageSource().contains(keyWord1));
    }

}
