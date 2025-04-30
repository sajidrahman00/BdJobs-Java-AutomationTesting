package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearchPage {
    WebDriver driver;

    By searchBox = By.id("txtKeyword");
    By searchButton = By.id("btnSearch");

    public JobSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchJob(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchButton).click();
    }
}
