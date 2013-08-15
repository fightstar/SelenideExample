package com.selenideexamle.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 18.07.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class BasicAjaxPage extends BasePage {
    @FindBy(id  = "combo1")
    private WebElement categoryDrpdwn;
    @FindBy(id = "combo2")
    private WebElement languageDrpdwn;
    @FindBy(id = "lteq30")
    private WebElement values;
    @FindBy(name = "submitbutton")
    private WebElement codeInItBtn;

    public void chooseJava(String category, String language, String value){
        $(categoryDrpdwn).selectOption(category);
        $(languageDrpdwn).shouldHave(Condition.hasText(language)).selectOption(language);
        $(values).setValue(value);
        $(codeInItBtn).click();
    }



    public BasicAjaxPage(WebDriver driver) {
        super(driver);
    }
}
