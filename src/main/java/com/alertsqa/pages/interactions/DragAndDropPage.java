package com.alertsqa.pages.interactions;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
@FindBy(css="#column-a")
WebElement draggableA;
    @FindBy(css="#column-b")
   WebElement draggableB;
    public DragAndDropPage changeThePlace() {
        new Actions(driver).dragAndDrop(draggableA,draggableB).perform();
        return this;
    }
}
