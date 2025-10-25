package com.alertsqa.pages.widgets;

import com.alertsqa.pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css="#content")
public WebElement hoversContainer;
    @FindBy(xpath="(//div[@class='figure'])[3]")
    public WebElement user3;

    public HoversPage moveMouseToShoWInfo() {
        pause(1000);
        new Actions(driver).moveToElement(user3).perform();
        return this;
    }

    public HoversPage verifyProfileValue() {
        Assert.assertTrue(shouldHaveText(user3, "name: user3", 5));
        return this;

    }

}
