package com.TSBFramewor.swati.testCases;

import com.TSBFramewor.swati.PageObject.BaseClass;
import com.TSBFramewor.swati.PageObject.ComputerPage;
import com.TSBFramewor.swati.PageObject.HomePage;
import com.TSBFramewor.swati.PageObject.SellPage;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class TestCase_Selling_item_04 extends BaseClass {

    public TestCase_Selling_item_04() throws FileNotFoundException {
    }

    @Test
    public void loginTest() {

        HomePage homePage = new HomePage(driver);
        driver.get(baseURl);
        ComputerPage cp = new ComputerPage(driver);

        SellPage sp = new SellPage(driver);
        sp.ClickOnSell();
        logger.info("Click on computer link from menu");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        sp.ClickOnGenerealITem();

        //click on sell
        //click on item
    }
}
