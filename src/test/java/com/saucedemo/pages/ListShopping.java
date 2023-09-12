package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListShopping {
    private WebDriver driver;

    public ListShopping(WebDriver driver) {
        this.driver = driver;
    }
    public void clickBtnCheckout () throws Exception {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(2000);

    }

}
