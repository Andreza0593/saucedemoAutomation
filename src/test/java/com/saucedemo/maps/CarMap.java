package com.saucedemo.maps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarMap {
    WebElement driver;

   @FindBy (xpath = "//*[@id=\"item_4_title_link\"]/div")
   public WebElement xpathBackpack;

   @FindBy (xpath = "//*[@id=\"item_1_title_link\"]/div")
   public WebElement xpathMsgShirt;

   @FindBy (xpath = "//*[@id=\"checkout\"]")
    public WebElement xpathBtnCheckout;

}
