package com.autobot.practice.practice1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {
    WebDriver driver;

    public SeleniumPractice() {
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("www.flipkart.com");
        driver.switchTo().frame("HomePage");
        driver.navigate().to("www.flipkart.com");
        driver.navigate().forward();


    }
//How to Handle Alerts in selenium
    public void SwitchToALerts()
    {

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("Test");

    }
//How to take Screenshot in selenium
    public void Screenshot(String destPath) {
        File destFile = new File(destPath);
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//This is the basic function how to handle multiple window in selenium
    public void SwitchToWindows() {
        for (String d : driver.getWindowHandles())
            driver.switchTo().window(d);
    }
//how to scrool with java script executor
    public void javaScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollToView()", element);
    }
///This is the format of expected condtion class
    public void ExpectedCondition(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
//Handle ssl certificate
    public void HandleSSLCertificate()
    {
        ChromeOptions handlingSSL = new ChromeOptions();

        //Using the accept insecure cert method with true as parameter to accept the untrusted certificate
       // handlingSSL.setAcceptInsecureCerts(true);
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
    }

//Handle multiple window login in selenium
    public void handleMultipleWindow(String title){
        WebDriver driver = new ChromeDriver();
        String parentwindow=driver.getWindowHandle();
        driver.switchTo().window(parentwindow);
        Set<String> WindowHandles= driver.getWindowHandles();
        List<String> handles= new ArrayList<>(WindowHandles);
        for(String s:handles)
        {
            if(driver.switchTo().window(s).getTitle().equals(title)){
                System.out.println("Find the correct window ");
                break;
            }

        }




    }


    public static void main(String[] args) {


    }

}
