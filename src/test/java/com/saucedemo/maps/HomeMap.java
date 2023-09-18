package com.saucedemo.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomeMap {
    WebElement driver;
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    public WebElement xpathUserName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement xpathPassword;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    public WebElement xpathBtnLogin;
}
