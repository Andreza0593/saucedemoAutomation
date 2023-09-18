package com.saucedemo.pages;
import com.saucedemo.maps.HomeMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v113.page.Page;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    public HomeMap homeMap;
     public HomePage(WebDriver driver) {

        this.driver = driver;
        homeMap = new HomeMap();
        PageFactory.initElements(driver, homeMap);
    }

    public void inputUserName (String username) throws Exception{
        homeMap.xpathUserName.sendKeys(username);
    }

    public void inputPassword (String password) throws Exception{
        homeMap.xpathPassword.sendKeys(password);
    }

    public void clickBtnLogin () throws Exception{
        homeMap.xpathBtnLogin.click();
    }



}
