package com.alertsqa.tests;

import com.alertsqa.pages.HomePage;
import com.alertsqa.pages.interactions.DragAndDropPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getDragAndDrop();
    }
    @Test
    public void DragAndDropTest(){
        new DragAndDropPage(driver).changeThePlace();//verifyResult();
    }
}
