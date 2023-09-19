package com.saucedemo.pages;

import com.saucedemo.maps.HomeMap;
import com.saucedemo.maps.OverviewMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    WebElement driver;
    OverviewMap overviewMap;

    public OverviewPage(WebDriver driver) {

        overviewMap = new OverviewMap();
        PageFactory.initElements(driver, overviewMap);

}

    public void titleOverview (){
        overviewMap.xpathTitleOverview.getText();
    }

    public void clickBtnFinish (){
        overviewMap.xpathBtnFinish.click();
    }

}
