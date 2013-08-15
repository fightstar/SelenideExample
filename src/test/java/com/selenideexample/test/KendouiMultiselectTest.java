package com.selenideexample.test;

import com.selenideexamle.pages.kendoui.KendouiMultiselectPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 30.07.13
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class KendouiMultiselectTest extends AbstractTest {
    @Test
    public void verifyMultiSelect() {
        KendouiMultiselectPage kendouiMultiselectPage = new KendouiMultiselectPage(getWebdriver());
        kendouiMultiselectPage.chooseRequiredByFullName("Nancy Davolio");
        kendouiMultiselectPage.deleneChoosenByFullName("Andrew Fuller");
        kendouiMultiselectPage.clickSendInvitationBtn();
        //home
        System.out.println("home");
        System.out.println("work");
    }
    @Override
    protected String getUrl(){
        return "web/multiselect/index.html";
    }
}
