package com.maven.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hooks {
    public static WebDriver driver;
    private String browser= ""

    @Before
    public void setUp(){
       openBrowser();
       //todo 2020-02-08 remove url from code
       navigateTo(url: "https://www.argos.co.uk");
       maxiBrowser();

    }
    @After
    public void tearDown(){
        driver.quit();
    }
    public void  navigateTo(String url){
        driver.get(url);
    }
    public void maxiBrowser(){
        driver.manage().window().maximize();
    }
    public void openBrowser(){
        switch (browser){
            case "ie";
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
            break;


        }
    }


}

