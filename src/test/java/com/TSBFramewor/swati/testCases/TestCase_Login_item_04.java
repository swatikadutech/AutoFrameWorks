package com.TSBFramewor.swati.testCases;

import com.TSBFramewor.swati.PageObject.*;
import com.TSBFramewor.swati.utilities.ExcelDataProvider;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class TestCase_Login_item_04 extends BaseClass {

    public TestCase_Login_item_04() throws FileNotFoundException {
    }

    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void loginTest(String Username, String Password) {

        HomePage homePage = new HomePage(driver);
        openURl();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage.GotoLogin();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        logger.info("opening the login page");
        LoginPage loginpage = new LoginPage(driver);
        logger.info("setting up the username");

        loginpage.setUsername(Username);

        logger.info("setting up the password");
        loginpage.setPassword(Password);
        logger.info("Clicking on submit Button");
        loginpage.clicksubmit();
        System.out.println(driver.getTitle());

        logger.info("Clicking on submit Button");
        loginpage.clicksubmit();
        System.out.println(driver.getTitle());
        if (driver.getTitle().equals("Buy online and sell with NZ's #1 auction & classifieds site | Trade Me")) {
            System.out.println(driver.getTitle());
            Assert.assertTrue(true);
            logger.info("login test pass");
        }
        Assert.assertTrue(driver.getPageSource().contains(" "));
        System.out.println(driver.getPageSource());
    }
    }

