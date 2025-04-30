package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CVSubmitPage {
    WebDriver driver;

    By uploadCVButton = By.id("uploadCV");
    By submitButton = By.id("submitCV");

    public CVSubmitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadCV(String filePath) {
        driver.findElement(uploadCVButton).sendKeys(filePath);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }
}
