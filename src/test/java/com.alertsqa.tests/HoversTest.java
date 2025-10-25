package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.widgets.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getHovers();
    }

    @Test
    public void viewProfileTest() {
        new HoversPage(driver).moveMouseToShoWInfo().verifyProfileValue();
    }
}

