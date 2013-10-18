package com.selenideexamle.pages.kendoui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.selenideexamle.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 30.07.13
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
public class KendouiMultiselectPage extends BasePage {
    @FindBy(xpath = "//ul[@id = 'required_taglist']/following-sibling::input")
    private WebElement multiSelectRequired;
    @FindBy(xpath = "//ul[@id = 'optional_taglist']/following-sibling::input")
    private WebElement multiSelectOptional;
    @FindBy(id = "get")
    private WebElement sendInvitationBtn;





    public void chooseRequiredByFullName(String fullName){
        SelenideElement element =  $(By.xpath("//ul[@id = 'optional_listbox']/li[contains(text(), '" + fullName + "')]"));
        multiSelectOptional.click();
        element.click();
    }
    public void deleteChoosenByFullName(String fullName){
        SelenideElement element
                = $(By.xpath("//ul[@id = 'required_taglist']/li/span[contains(text(), '" + fullName + "')]/following-sibling::span"));
        element.click();
    }
    public void clickSendInvitationBtn() {
        $(sendInvitationBtn).shouldBe(Condition.enabled).click();
    }
    public KendouiMultiselectPage(WebDriver driver) {
        super(driver);
    }
}
