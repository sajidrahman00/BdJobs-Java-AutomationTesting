package com.bdjobs.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationPage {
    WebDriver driver;

    By notificationBell = By.id("notificationBell");

    public NotificationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openNotifications() {
        driver.findElement(notificationBell).click();
    }
}
