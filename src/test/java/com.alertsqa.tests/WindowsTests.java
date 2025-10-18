package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.alertsFrameWindows.WindowsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsTests extends TestBase {
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getWindowsFrameWindow();
    }
@Test
    public void clickOnOpeningNewWindowTest(){
        new WindowsPage(driver).openNewWindow();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://the-internet.herokuapp.com/windows/new");

}
}
