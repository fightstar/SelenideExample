package com.selenideexamle.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 17.07.13
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
public class AlertPage extends BasePage {
    @FindBy(id  = "alertexamples")
    private WebElement showAlertBoxPageBtn;



    public void clickShowAlertBoxPageBtn() {
        $(showAlertBoxPageBtn).shouldBe(Condition.visible).click();
    }

    public AlertPage(WebDriver driver) {
        super(driver);
    }
}
