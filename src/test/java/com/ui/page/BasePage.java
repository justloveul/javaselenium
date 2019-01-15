package com.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {
    WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getElement(By by){
        return new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> getElements(By by){
        return new WebDriverWait(webDriver, 5).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
