package com.alertsqa.pages.alertsFrameWindows;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/windows/new']")
    WebElement newWindow;
public WindowsPage openNewWindow(){
    click(newWindow);
    driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    return new WindowsPage(driver);
}
}
