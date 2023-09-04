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
        driver.get("http://www.saucedemo.com");
    }
    @Test
    public void acessLoginAutomation() throws Exception {


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();
    }
    @Test
    public void shoppingAutomation() throws Exception {

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

       driver.findElement(By.name("firstName")).sendKeys("Maria");
       Thread.sleep(2000);
       driver.findElement(By.name("lastName")).sendKeys("Rocha");
       Thread.sleep(2000);
       driver.findElement(By.name("postalCode")).sendKeys("69065853");
       Thread.sleep(2000);
       driver.findElement(By.name("continue")).click();
       Thread.sleep(2000);
       driver.findElement(By.name("finish")).click();
       Thread.sleep(2000);

    }
    @AfterTest
    public void finalizaAutomation() {
        driver.quit();


    }



}
