package com.saucedemo.pages;
import com.saucedemo.maps.ProductsMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public WebDriver driver;
    public ProductsMap productsMap;

    public ProductsPage(WebDriver driver) {

        this.driver = driver;
        productsMap = new ProductsMap();
        PageFactory.initElements(driver, productsMap);
    }

    public void titleProducts (){

        productsMap.xpathMsgProducts.getText();
    }

    public void addBckpack()  {
        productsMap.xpathBackpack.click();

    }

    public void addTShirt() throws Exception{
        productsMap.xpathShirt.click();
        Thread.sleep(2000);
    }

    public void clickBtnCar()  {

        productsMap.xpathClickBtnCar.click();
    }
}
