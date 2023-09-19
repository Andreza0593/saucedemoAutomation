package com.saucedemo.automacao;
import com.saucedemo.core.Driver;
import com.saucedemo.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAutomation {

    WebDriver driver;
    Driver driverWeb;
    HomePage homePage;
    ProductsPage productsPage;
    CarPage carPage;
    RegisterPage registerPage;
    OverviewPage overviewPage;
    CompletePage completePage;

    @BeforeTest
    public void start() {
        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("http://www.saucedemo.com");
        homePage = new HomePage(driver);

    }

    @Test
    public void login() throws Exception {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        carPage = new CarPage(driver);
        registerPage = new RegisterPage(driver);
        overviewPage = new OverviewPage(driver);
        completePage = new CompletePage(driver);


        homePage.inputUserName("standard_user");
        homePage.inputPassword("secret_sauce");
        Thread.sleep(2000);
        homePage.clickBtnLogin();


        productsPage.titleProducts();
        productsPage.addBckpack();
        productsPage.addTShirt();
        Thread.sleep(2000);
        productsPage.clickBtnCar();


        carPage.vldBackpack();
        carPage.vldShirt ();
        Thread.sleep(2000);
        carPage.clickBtnCheckout();


        registerPage.inputFirstName("Marta");
        registerPage.inputLastName("Rios");
        registerPage.inputPostalCode("69092651");
        Thread.sleep(2000);
        registerPage.clickBtnContinue();


        overviewPage.titleOverview();
        Thread.sleep(2000);
        overviewPage.clickBtnFinish();


        completePage.titleComplete();
        Thread.sleep(2000);
    }

    @AfterTest
    public void finish() {
        driver.quit();
    }
}