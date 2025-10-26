package com.alertsqa.pages.alertsFrameWindows;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li:nth-child(1) button")
    WebElement jsAlertButton;

    public AlertsPage clickOnJSAlert() {
        click(jsAlertButton);
        // new WebDriverWait(driver, Duration.ofSeconds(5))
        //.until(ExpectedConditions.alertIsPresent());
        return this;
    }

    @FindBy(css = "li:nth-child(2) button")
    WebElement jsConfirmAlertButton;

    public AlertsPage confirmAlert() {
        click(jsConfirmAlertButton);
        return this;
    }
    @FindBy(css = "li:nth-child(3) button")
    WebElement jsPromptAlertButton;
    public AlertsPage promptAlert() {
        click(jsPromptAlertButton);
        return this;
    }
    public AlertsPage sendTextToPrompt(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
        return this;
    }
    public AlertsPage dismissPrompt() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        return this;
    }
}
