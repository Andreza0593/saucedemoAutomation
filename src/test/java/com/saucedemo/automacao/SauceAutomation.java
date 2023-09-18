package com.saucedemo.automacao;
import com.saucedemo.core.Driver;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.CarPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAutomation {

    WebDriver driver;
    Driver driverWeb;
    HomePage homePage;
    ProductsPage productsPage;
    CarPage carPage;
    RegisterPage registerPage;

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



        homePage.inputUserName("standard_user");
        homePage.inputPassword("secret_sauce");
        Thread.sleep(2000);
        homePage.clickBtnLogin();


        productsPage.msgProducts();
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

        /*WebElement finish = driver.findElement(By.tagName("finish"));
        new Actions(driver)
                .scrollToElement(finish)
                .perform();
       driver.findElement(By.name("finish")).click();
       Thread.sleep(2000);

    }
    @AfterTest
    public void finaliza() {
        driver.quit();
    }*/

    }
}