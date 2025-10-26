package com.alertsqa.pages.widgets;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "range")
    WebElement sliderValue;
@FindBy(css="input[type='range']")
    WebElement sliderInPut;

    public HorizontalSliderPage moveSlider() {
        pause(1000);
        new Actions(driver).dragAndDropBy(sliderInPut, 129, 0).perform();
        return this;
    }
    public HorizontalSliderPage verifyValue(String number) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.textToBePresentInElement(sliderValue,number));
        Assert.assertEquals(sliderValue.getText(),number);
        return this;
    }
}
