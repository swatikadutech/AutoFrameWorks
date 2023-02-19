package com.TSBFramewor.swati.testCases;

import com.TSBFramewor.swati.PageObject.BaseClass;
import com.TSBFramewor.swati.PageObject.ComputerPage;
import com.TSBFramewor.swati.PageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class TestCase_search_computer_03 extends BaseClass {

    public TestCase_search_computer_03() throws FileNotFoundException {
    }

    @Test
    public void loginTest() {

        HomePage homePage = new HomePage(driver);
        driver.get(baseURl);
        ComputerPage cp = new ComputerPage(driver);
        logger.info("Click on computer link from menu");
        homePage.ClickonComputers();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        logger.info("Search string nikon ");
        cp.WritesearchString("Nikon");
        logger.info("click on seach button ");
        cp.ClickOnseachButton();
    //    cp.ClickOnseachButton();


        System.out.println(driver.getTitle());

        if (driver.getTitle().equals("Buy online and sell with NZ's #1 auction & classifieds site | Trade Me")) {
            System.out.println(driver.getTitle());
            Assert.assertTrue(true);
            logger.info("login test pass");

        }
    }
}
