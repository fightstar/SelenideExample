package com.selenideexample.test;

import com.selenideexamle.pages.BasicAjaxPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 18.07.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class BasicAjaxTest extends AbstractTest {
    @Test
    public void verifyBasicAjax() {
        BasicAjaxPage basicAjaxPage = new BasicAjaxPage(getWebDriver());

        basicAjaxPage.chooseJava("Server","Cobol","1");

    }
    @Override
    protected String getUrl(){
        return "/basic_ajax.html";
    }

}
