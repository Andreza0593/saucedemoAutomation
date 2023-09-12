package com.saucedemo.automacao;
import com.saucedemo.core.Driver;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ListShopping;
import com.saucedemo.pages.RegisterInformation;
import com.saucedemo.pages.ShoppingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAutomation{

    WebDriver driver;
    Driver driverWeb;
    HomePage homePage;
    ShoppingPage shoppingPage;
    ListShopping listShopping;
    RegisterInformation registerInformation;

    @BeforeTest
    public void inicializa() {
        driverWeb = new Driver("chrome");

        driver = driverWeb.getDriver();

        driver.get("http://www.saucedemo.com");
        homePage = new HomePage(driver);

    }
    @Test
    public void accessLogin() throws Exception {
         homePage.inputUserName("username");
         homePage.inputPassword("password");
         homePage.clickBtnLogin();
    }
    @Test
    public void shopping() throws Exception {
        shoppingPage.addBackpack();
        shoppingPage.addBoldTShirt();
        shoppingPage.addBikeLight();
        shoppingPage.clickBtnCar();

        listShopping.clickBtnCheckout();

        registerInformation.inputFirstName("firstname");
        registerInformation.inputLasttName("lastname");
        registerInformation.inputPostalCode(69092651);


       driver.findElement(By.name("finish")).click();
       Thread.sleep(2000);

    }
    @AfterTest
    public void finaliza() {
        driver.quit();


    }



}
