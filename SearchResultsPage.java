package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    WebDriver driver;

    By firstJobLink = By.cssSelector(".job-listing a");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstJob() {
        driver.findElement(firstJobLink).click();
    }
}
