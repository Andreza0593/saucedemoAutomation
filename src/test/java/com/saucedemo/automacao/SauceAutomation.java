package com.saucedemo.automacao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceAutomation{

    WebDriver driver;

    @BeforeTest
    public void inicializaAutomation() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void validaAutomation() throws Exception {
        driver.get("http://www.saucedemo.com");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();


        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

        Thread.sleep(2000);


        driver.findElement(By.id("first-name")).sendKeys("Marcel");
        Thread.sleep(2000);
        driver.findElement(By.id("last-name")).sendKeys("Aleixo");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("69092651");
        Thread.sleep(2000);

    }
   /* @AfterTest
    public void finalizaAutomation() {
        driver.quit();


    }*/



}
