package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearchPage {
    WebDriver driver;

    By searchField = By.id("txtKeyword");
    By locationField = By.id("txtLocation");
    By searchButton = By.id("btnSearch");

    public JobSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterJobTitle(String jobTitle) {
        driver.findElement(searchField).sendKeys(jobTitle);
    }

    public void enterLocation(String location) {
        driver.findElement(locationField).sendKeys(location);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
