package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {
    private WebDriver driver;

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addBackpack () throws Exception {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);

    }
    public void addBoldTShirt () throws Exception {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        Thread.sleep(2000);

    }
    public void addBikeLight () throws Exception {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        Thread.sleep(2000);

    }
    public void clickBtnCar () throws Exception {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);

    }
}
