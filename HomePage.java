package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By searchBox = By.id("txtKeyword");
    By searchButton = By.id("btnSearch");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterKeyword(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
