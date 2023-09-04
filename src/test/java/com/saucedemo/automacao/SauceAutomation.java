package com.saucedemo.automacao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAutomation{

    ChromeDriver driver;

    @BeforeTest
    public void inicializaAutomation() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }
    @Test
    public void validaAutomation() throws Exception {
        driver.get("http://www.saucedemo.com");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        Thread.sleep(5000);
    }
    @AfterTest
    public void finalizaAutomation() {
        driver.quit();


    }



}
