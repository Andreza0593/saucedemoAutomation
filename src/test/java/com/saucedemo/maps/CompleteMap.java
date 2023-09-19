package com.saucedemo.maps;

import com.saucedemo.pages.CompletePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteMap {
    WebElement driver;
    CompletePage completePage;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    public WebElement xpathTitleComplete;
}
