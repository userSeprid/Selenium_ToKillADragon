package com.seprid.testings;

import com.seprid.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example {

    WebDriver driver = DriverWrapper.DRIVER;

    public void init () {
        driver.get("https://en.wikipedia.org/wiki/Aleksandr_Abdulov");

        WebElement element = driver.findElement(By.partialLinkText("To Kill a Dragon"));
        System.out.println(element.getText());
        element.click();
    }
}
