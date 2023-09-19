package com.saucedemo.maps;

import com.saucedemo.pages.OverviewPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewMap {
    WebElement driver;
    OverviewPage overviewPage;

    @FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement xpathTitleOverview;

    @FindBy (xpath = "//*[@id=\"finish\"]")
    public WebElement xpathBtnFinish;
}
