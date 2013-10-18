package com.selenideexample.test;

import com.selenideexamle.pages.kendoui.FilterMenuCustomizationPage;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 07.10.13
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class FilterMenuCustomizationTest extends AbstractTest {
    @Test
    public void verifyFilter() {
        FilterMenuCustomizationPage filterMenuCustomizationPage  = new FilterMenuCustomizationPage(getWebDriver());

        filterMenuCustomizationPage.choseAndApplyFilter("Title", "Is equal to","Web Designer");

        int i = filterMenuCustomizationPage.getCountOfRowsInTable("//div[@id = 'grid']//tbody/tr");
        System.out.println(i);
    }
    @Override
    protected  String getUrl() {
        return "web/grid/filter-menu-customization.html";
    }
}
