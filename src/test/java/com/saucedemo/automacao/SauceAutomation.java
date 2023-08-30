package com.saucedemo.automacao;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceAutomation{

    ChromeDriver driver;

    @Test
    public void ValidaAutomation(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }



}
