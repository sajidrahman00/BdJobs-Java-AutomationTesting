package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    WebDriver driver;

    By editProfileButton = By.id("btnEditProfile");
    By fullNameField = By.id("txtFullName");
    By uploadPhotoButton = By.id("btnUploadPhoto");
    By saveButton = By.id("btnSave");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEditProfile() {
        driver.findElement(editProfileButton).click();
    }

    public void updateFullName(String fullName) {
        driver.findElement(fullNameField).clear();
        driver.findElement(fullNameField).sendKeys(fullName);
    }

    public void uploadPhoto(String filePath) {
        driver.findElement(uploadPhotoButton).sendKeys(filePath);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }
}
