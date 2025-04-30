package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InboxPage {
    WebDriver driver;

    By inboxLink = By.id("inboxLink");

    public InboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openInbox() {
        driver.findElement(inboxLink).click();
    }
}
