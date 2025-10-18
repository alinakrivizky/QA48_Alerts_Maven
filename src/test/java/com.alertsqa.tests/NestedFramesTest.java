package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.alertsFrameWindows.FramePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getNestedFramesWindow();
    }
    @Test
    public void verifyTopFramesTexts(){
            new FramePage(driver)
                    .returnListOfFrames()
                    .switchToTopFrame()
                    .verifyFrameTitle("LEFT")
                    .verifyFrameTitle1("MIDDLE")
                    .verifyFrameTitle2("RIGHT")
                    .switchToBottomFrame()
                    .verifyFrameTitle3("BOTTOM");

    }
}
