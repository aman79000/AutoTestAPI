package com.autobot.practice.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDesignPattern {

    private static  volatile SingletonDesignPattern instance = null;
    private static  ThreadLocal <WebDriver> driver= new ThreadLocal<>();

    private SingletonDesignPattern(){

    }

    private static void initlize(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver.set(new ChromeDriver());
        }
        else{
            driver.set(new FirefoxDriver());
        }
    }
     public static SingletonDesignPattern getInstance(String browser) {
         if (instance == null) {
             synchronized (SingletonDesignPattern.class) {
                 if (instance == null) {
                     instance = new SingletonDesignPattern();
                 }
             }
         }
         if (driver == null) {

             initlize(browser);
         }
         return instance;
     }
public WebDriver getWebDriver(){
       return  driver.get();
}

public void terminateBrowser(){
        driver.get().quit();
}

}


