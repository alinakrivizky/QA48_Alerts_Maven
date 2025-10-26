package com.alertsqa.pages.alertsFrameWindows;

import com.alertsqa.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "frame")
    List<WebElement> frames;

    public FramePage returnListOfFrames() {
        System.out.println("The total number of frames are: " + frames.size());
        return this;
    }

    public FramePage switchToTopFrame() {
        driver.switchTo().frame("frame-top");
        return this;
    }

    public FramePage verifyFrameTitle(String title) {
        driver.switchTo().frame("frame-left");
        Assert.assertTrue(shouldHaveText(driver.findElement(By.tagName("body")), title, 5));
        driver.switchTo().parentFrame();
        return this;
    }

    public FramePage verifyFrameTitle1(String title) {
        driver.switchTo().frame("frame-middle");
        Assert.assertTrue(shouldHaveText(driver.findElement(By.tagName("body")), title, 5));
        driver.switchTo().parentFrame();
        return this;
    }

    public FramePage verifyFrameTitle2(String title) {
        driver.switchTo().frame("frame-right");
        Assert.assertTrue(shouldHaveText(driver.findElement(By.tagName("body")), title, 5));
        driver.switchTo().parentFrame();
        return this;
    }

    public FramePage switchToBottomFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        return this;
    }

    public FramePage verifyFrameTitle3(String title) {
        Assert.assertTrue(shouldHaveText(driver.findElement(By.tagName("body")), title, 5));
        driver.switchTo().defaultContent();
        return this;
    }
}

