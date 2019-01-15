package com.ui.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
    WebDriver webDriver;

    public BaseDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\python3\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    public WebDriver getDriver(){
        return webDriver;
    }

}
