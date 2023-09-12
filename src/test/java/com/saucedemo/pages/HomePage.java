package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUserName (String username) throws Exception{
        String xpathUserName = "//*[@id=\"user-name\"]";
        driver.findElement(By.xpath(xpathUserName)).sendKeys(username);
        Thread.sleep(2000);
    }

    public void inputPassword (String password) throws Exception{
        String xpathPassword = "//*[@id=\"password\"]";
        driver.findElement(By.xpath(xpathPassword)).sendKeys(password);
        Thread.sleep(2000);
    }

    public void clickBtnLogin () throws Exception{
        String xpathBtnLogin = "//*[@id=\"login-button\"]";
        driver.findElement(By.xpath(xpathBtnLogin)).click();
        Thread.sleep(2000);
    }



}
