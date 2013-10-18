package com.selenideexamle.pages.kendoui;

import com.codeborne.selenide.SelenideElement;
import com.selenideexamle.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created with IntelliJ IDEA.
 * User: vshevchenko
 * Date: 07.10.13
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class FilterMenuCustomizationPage extends BasePage {
    @FindBy(xpath = "//div[@id = 'grid']//thead//th[@data-field = 'Title']/a")
    private WebElement filterButton;   // возможно span
    @FindBy(xpath = "//div[@class = 'k-animation-container']//span[contains(text(), 'Starts with')]")
    private WebElement startsWith;
    @FindBy(xpath = "//div[@class = 'k-animation-container']//span[1]/span[1]/span[1]")
    private WebElement condition;
    @FindBy(xpath = "//div[@class = 'k-animation-container']//input")
    private WebElement input;
    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitBtn;
    @FindBy(xpath = "//div[@id = 'grid']//tbody/tr")
    private WebElement tableRaw;



    public WebElement getTableRaw() {
        return tableRaw;
    }
    public int getCountOfRowsInTable (String xpath){
        List<WebElement> rows = webDriver.findElements(By.xpath(xpath));
        return rows.size() ;
    }
    public void choseAndApplyFilter(String nameOfColumn,String nameCondition, String inputValue ) {
        clickOnChoosenFilter(nameOfColumn);
        chooseFilterAction(nameCondition, inputValue);

    }
    public void chooseFilterAction(String nameConditions, String inputValue) {
        builder = new Actions(webDriver);
        builder.click(condition);
        builder.sendKeys(condition,nameConditions);
        builder.sendKeys(input, inputValue);
        builder.click(submitBtn);
        Action filter = builder.build();

        filter.perform();

    }


    private void clickOnChoosenFilter(String nameOfColumn) {
        SelenideElement filter  =
                $(By.xpath("//div[@id = 'grid']//thead//th[@data-field = '" + nameOfColumn + "']/a"));
        filter.click();
    }


    public FilterMenuCustomizationPage(WebDriver driver) {
        super(driver);
    }
}
