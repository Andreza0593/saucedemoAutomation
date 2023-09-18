package com.saucedemo.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsMap {
    private WebElement driver;

    @FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement xpathMsgProducts;

    @FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    public WebElement xpathBackpack;

    @FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    public WebElement xpathShirt;

    @FindBy (xpath = "//*[@id=\"shopping_cart_container\"]/a")
    public WebElement xpathClickBtnCar;
}







