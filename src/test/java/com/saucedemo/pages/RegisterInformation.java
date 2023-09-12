package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterInformation {
    private WebDriver driver;

    public RegisterInformation(WebDriver driver) {
        this.driver = driver;
    }
    public void inputFirstName (String firstname) throws Exception {
        String xpathFirstName = "//*[@id=\"first-name\"]";
        driver.findElement(By.xpath(xpathFirstName)).sendKeys(firstname);
        Thread.sleep(2000);
    }
    public void inputLasttName (String lastname) throws Exception {
        String xpathLastName = "//*[@id=\"last-name\"]";
        driver.findElement(By.xpath(xpathLastName)).sendKeys(lastname);
        Thread.sleep(2000);
    }
    public void inputPostalCode (int postalCode) throws Exception {
        String xpathPostalCode = "//*[@id=\"postal-code\"]";
        driver.findElement(By.xpath(xpathPostalCode)).sendKeys();
        Thread.sleep(2000);
    }
    public void clickBtnContinue () throws Exception{
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
    }
}