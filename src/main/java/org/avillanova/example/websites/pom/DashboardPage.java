package org.avillanova.example.websites.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.avillanova.example.websites.config.Hook.driver;
import static org.avillanova.example.websites.config.Tools.waitBy;

public class DashboardPage {
    @FindBy(how = How.ID, using = "root")
    WebElement root;

    public DashboardPage() {
        PageFactory.initElements(driver(), this);
        waitBy(root);
    }

    public String getDashUrl() {
        return driver().getCurrentUrl();
    }

}
