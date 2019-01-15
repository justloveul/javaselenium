package com.ui.handle;

import com.ui.page.Homepage;
import org.openqa.selenium.WebDriver;

public class Homehandle{
    WebDriver webDriver;
    Homepage homepage;
    public Homehandle(WebDriver webDriver) {
        this.webDriver = webDriver;
        homepage = new Homepage(webDriver);
    }
    public void sendKeys(String msg){
        homepage.getSearchElement().sendKeys(msg);
    }

    public void clickcheck(){
        homepage.getbuttonElement().click();
    }
}
