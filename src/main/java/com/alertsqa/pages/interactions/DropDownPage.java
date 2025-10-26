package com.alertsqa.pages.interactions;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath ="//select[@id='dropdown']")
WebElement dropdownButton;
    public DropDownPage clickOnDropdownList() {
        click(dropdownButton);
        return new DropDownPage(driver);
    }
@FindBy(css ="option[value='1']")
WebElement dropdownOption1;
    public void chooseOption() {
        click(dropdownOption1);
    }

}
