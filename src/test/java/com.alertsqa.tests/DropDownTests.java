package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.interactions.DropDownPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDropdownFrameWindow();
    }
    @Test
    public void clickOnDropdownButtonTest(){
        new DropDownPage(driver).clickOnDropdownList().chooseOption();


    }

}
