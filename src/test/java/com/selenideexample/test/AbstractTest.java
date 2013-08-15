package com.selenideexample.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 17.07.13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class AbstractTest   {
    private WebDriver driver;
    public WebDriver getWebdriver() {
        if (driver == null){
        driver = new FirefoxDriver();
        }
        return driver;
    }

    @BeforeMethod
    public void SetUp(){

        WebDriverRunner.setWebDriver(getWebdriver());
        Configuration.timeout = 4000;
        //getWebdriver().get("http://compendiumdev.co.uk/selenium" + getUrl());
        getWebdriver().get("http://demos.kendoui.com/"+getUrl());
    }
    protected String getUrl(){
        return "/";
    }


}
