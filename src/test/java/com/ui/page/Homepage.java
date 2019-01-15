package com.ui.page;

import com.ui.base.BaseDriver;
import com.ui.common.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Homepage extends BasePage {
    public Homepage(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSearchElement() {
        return getElement(Util.getValue("search"));
    }

    public WebElement getbuttonElement(){
        return getElement(Util.getValue("button"));
    }
}
