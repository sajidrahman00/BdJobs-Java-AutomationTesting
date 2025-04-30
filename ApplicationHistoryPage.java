package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationHistoryPage {
    WebDriver driver;

    By applicationHistoryTab = By.id("applicationHistoryTab");

    public ApplicationHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openApplicationHistory() {
        driver.findElement(applicationHistoryTab).click();
    }
}
