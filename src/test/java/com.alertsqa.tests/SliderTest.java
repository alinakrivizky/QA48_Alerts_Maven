package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.widgets.HorizontalSliderPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SliderTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHorizontalSlider();
    }
    @Test
    public void sliderTest() {
        new HorizontalSliderPage(driver).moveSlider().verifyValue("5");
    }

}
