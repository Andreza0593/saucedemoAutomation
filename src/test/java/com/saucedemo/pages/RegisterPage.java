package com.saucedemo.pages;

import com.saucedemo.maps.RegisterMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;
    public RegisterMap registerMap;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        registerMap = new RegisterMap();
        PageFactory.initElements(driver, registerMap);

    }
    public void inputFirstName (String firstname) {

        registerMap.xpathFirstName.sendKeys(firstname);
    }
    public void inputLastName (String lastname) {

        registerMap.xpathLastName.sendKeys(lastname);
    }
    public void inputPostalCode (String postalCode) {

        registerMap.xpathPostalCode.sendKeys(postalCode);
    }
    public void clickBtnContinue () {
        registerMap.xpathBtnContinue.click();
    }
}


