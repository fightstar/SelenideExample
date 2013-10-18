package com.selenideexamle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 16.07.13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class BasePage {
    protected WebDriver webDriver;
    protected Actions builder;

    public BasePage(WebDriver driver){
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);


    }



}
