package org.avillanova.example.websites.config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.avillanova.example.websites.config.Hook.driver;

public class Tools {

    public static WebElement waitBy(WebElement element) {
        try{
            new WebDriverWait(driver(), 50)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.err.println(element + " Nao encontrado...");
        }
        return element;
    }



}
