package com.alertsqa.tests;

import com.alertsqa.pages.alertsFrameWindows.AlertsPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsTests extends TestBase {
    @Test
    public void clickOnJSAlertButtonTest() {
        new AlertsPage(driver).clickOnJSAlert();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
    }

    @Test
    public void clickOnJSConfirmButtonOKTest() {
        new AlertsPage(driver).confirmAlert();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.accept();
    }

    // @Test
    //public void clickOnJSConfirmButtonCancelTest() {
    //new AlertsPage(driver).confirmAlert();
    //Alert alert = driver.switchTo().alert();
    //Assert.assertEquals(alert.getText(), "I am a JS Confirm");
    // alert.dismiss();
    //}
    @Test
    public void clickOnJSPromptButtonOKTest() {
        new AlertsPage(driver).promptAlert().sendTextToPrompt("Hi,ALina");
    }
}
   // @Test
    //public void clickOnJSPromptButtonCancelTest() {
        //new AlertsPage(driver).promptAlert().dismissPrompt();


