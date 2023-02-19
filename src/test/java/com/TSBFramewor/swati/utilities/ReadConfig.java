package com.TSBFramewor.swati.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() throws FileNotFoundException {

        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String getApplicationURl() {
        String url = pro.getProperty("baseURl");
        return url;
    }

    public String getUsername() {
        String username = pro.getProperty("userName");
        return username;
    }

    public String getpassword() {
        String password = pro.getProperty("password");
        return password;
    }

}
