package com.saucedemo.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMap {
    WebElement driver;

    @FindBy (xpath = "//*[@id=\"first-name\"]")
    public WebElement xpathFirstName;

    @FindBy (xpath = "//*[@id=\"last-name\"]")
    public WebElement xpathLastName;

    @FindBy (xpath = "//*[@id=\"postal-code\"]")
    public WebElement xpathPostalCode;

    @FindBy (xpath = "//*[@id=\"continue\"]")
    public WebElement xpathBtnContinue;
}
