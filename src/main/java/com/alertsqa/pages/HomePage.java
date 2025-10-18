package com.alertsqa.pages;

import com.alertsqa.pages.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
@FindBy (css ="a[href='/javascript_alerts']")
WebElement alert;
    public HomePage getAlertsFrameWindows() {
        click(alert);
        return new HomePage(driver);
    }
@FindBy (css="a[href='/nested_frames']")
    WebElement nested_frames;
    public HomePage getNestedFramesWindow() {
        click(nested_frames);
        return new HomePage(driver);
    }
    @FindBy(css="a[href='/windows']")
    WebElement window;
    public HomePage getWindowsFrameWindow() {
        click(window);
        return new HomePage(driver);
    }
    @FindBy(css="a[href='/dropdown']")
    WebElement dropdown;
    public HomePage getDropdownFrameWindow() {
        click(dropdown);
        return new HomePage(driver);
    }
}
