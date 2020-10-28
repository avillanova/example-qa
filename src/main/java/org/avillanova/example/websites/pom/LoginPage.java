package org.avillanova.example.websites.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.avillanova.example.websites.config.Hook.driver;
import static org.avillanova.example.websites.config.Tools.waitBy;
import static org.avillanova.example.websites.config.Urls.LOGIN_URL;

public class LoginPage {
    @FindBy(how = How.ID, using = "username")
    WebElement userElement;
    @FindBy(how = How.ID, using = "password")
    WebElement passElement;

    @FindBy(how = How.XPATH, using = "//p[contains(@class, 'signup-legal')]")
    WebElement textLegal;

    @FindBy(how = How.ID, using = "login-submit")
    WebElement btContinuar;


    public LoginPage() {
        PageFactory.initElements(driver(), this);
    }

    public LoginPage access() {
        driver().get(LOGIN_URL.getUrl());
        return this;
    }

    public String pegarTextLegal() {
        return waitBy(textLegal).getText();
    }

    public LoginPage loginInvalido(String user) {
        waitBy(userElement).sendKeys(user);
        waitBy(btContinuar).click();
        return this;
    }

    public DashboardPage loginValido(String user, String password){
        waitBy(userElement).sendKeys(user);
        waitBy(btContinuar).click();
        waitBy(passElement).sendKeys(password);
        passElement.submit();
        return new DashboardPage();
    }

}
