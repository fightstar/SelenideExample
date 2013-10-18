package com.selenideexample.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 17.07.13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class AbstractTest   {
    private WebDriver driver;

    public WebDriver getWebDriver() {
        return driver;
    }
    @BeforeClass
    public void SetUp(){
        System.out.println("webdriver init");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
        Configuration.timeout = 4000;
        //getWebdriver().get("http://compendiumdev.co.uk/selenium" + getUrl());
        driver.get("http://demos.kendoui.com/" + getUrl());
    }

    protected String getUrl(){
        return "/";
    }


}
