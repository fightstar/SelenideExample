package com.selenideexample.test;

import com.selenideexamle.pages.AlertPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 17.07.13
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class AlertTest extends AbstractTest {
    @Test
    public void verifyAlert() {
        AlertPage alertPage  = new AlertPage(getWebDriver());
        alertPage.clickShowAlertBoxPageBtn();

    }
    @Override
    protected String getUrl(){
        return "/alert.html";
    }
}
