package com.saucedemo.pages;

import com.saucedemo.maps.CarMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CarPage {
    public WebElement driver;
    public CarMap carMap;

    public CarPage (WebDriver driver) {

        carMap = new CarMap();
        PageFactory.initElements(driver, carMap);

    }

    public void vldBackpack () {
        carMap.xpathBackpack.getText();

    }
    public void vldShirt () throws Exception {
        carMap.xpathMsgShirt.getText();
        Thread.sleep(2000);
    }

   public void clickBtnCheckout ()  {
        carMap.xpathBtnCheckout.click();


    }

}
