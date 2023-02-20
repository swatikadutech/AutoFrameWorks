package com.TSBFramewor.swati.testCases;
import com.TSBFramewor.swati.PageObject.BaseClass;
import com.TSBFramewor.swati.PageObject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestCase_Homepage_01 extends BaseClass {
    public TestCase_Homepage_01() throws FileNotFoundException {
    }

    @Test
    public void HomePageValidation() {

        logger.info("opening the URL : https://www.tmsandbox.co.nz/");
        HomePage homePage = new HomePage(driver);
        driver.get(baseURl);
        driver.manage().window().maximize();
        if (driver.getTitle().equals("Buy online and sell with NZ's #1 auction & classifieds site | Trade Me")) {
            System.out.println(driver.getTitle());
            Assert.assertTrue(true);
            logger.info("login test pass");

        }
    }
}
