package com.seprid.ui.core;

import com.seprid.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractUIElement {

    protected final WebDriver driver;
    protected String name;
    protected String value;

    public AbstractUIElement(String name, String URL) {
        this.driver = DriverWrapper.DRIVER;
        driver.get(URL);
        this.name = name;
    }

    protected WebElement waitVisibilityPartialLinkText(String partialLinkText) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));
        return driver.findElement(By.partialLinkText(partialLinkText));
    }
}
