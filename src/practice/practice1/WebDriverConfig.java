package com.autobot.practice.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    private static volatile WebDriverConfig instance;
    private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

    private WebDriverConfig() {
        if (instance != null) {
            throw new RuntimeException("Object is already there");
        }
    }

    public static WebDriverConfig getInstance() {
        if (instance == null) {
            synchronized (WebDriverConfig.class) {
                if (instance == null) {
                    instance = new WebDriverConfig();
                }
            }

            if (tldriver == null) {
                tldriver.set(new ChromeDriver());
            }


        }
        return instance;
    }

    public WebDriver getDriver() {
        return tldriver.get();
    }


    public static void tearDown() {
        if(tldriver!=null) {
            tldriver.get().quit();
            tldriver.remove();
        }
    }

}
