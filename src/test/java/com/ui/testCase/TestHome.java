package com.ui.testCase;

import com.ui.base.BaseDriver;
import com.ui.handle.Homehandle;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHome {
    WebDriver webDriver;
    Homehandle homehandle;
    @BeforeClass
    public void setUp(){
        webDriver = new BaseDriver().getDriver();
        homehandle = new Homehandle(webDriver);
    }
    @Test
    public void test1() {
        Reporter.log("搜索美女");
        webDriver.get("http://www.baidu.com");
        homehandle.sendKeys("美女");
        homehandle.clickcheck();

    }

    @AfterClass
    public void tearDown(){
        webDriver.close();
    }
}
