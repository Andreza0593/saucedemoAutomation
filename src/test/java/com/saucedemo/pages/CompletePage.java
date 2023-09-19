package com.saucedemo.pages;

import com.saucedemo.maps.CompleteMap;
import com.saucedemo.maps.OverviewMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
    WebElement driver;
    CompleteMap completeMap;

    public CompletePage(WebDriver driver) {

        completeMap = new CompleteMap();
        PageFactory.initElements(driver, completeMap);
    }
    public void titleComplete(){
    completeMap.xpathTitleComplete.getText();
    }
}