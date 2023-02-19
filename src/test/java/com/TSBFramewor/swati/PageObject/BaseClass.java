package com.TSBFramewor.swati.PageObject;

import com.TSBFramewor.swati.utilities.ReadConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class BaseClass {

    public static WebDriver driver;
    public static Logger logger;
    ReadConfig readConfig = new ReadConfig();
    public String baseURl = readConfig.getApplicationURl();
    public String userName = readConfig.getUsername();
    public String password = readConfig.getpassword();

    public BaseClass() throws FileNotFoundException {
    }

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
        driver = new ChromeDriver();
        logger = Logger.getLogger("Tradesand URl");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
