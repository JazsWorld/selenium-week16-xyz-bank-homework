package com.way2automation.http.pages;

import com.way2automation.http.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = Logger.getLogger(BankManagerLoginPage.class);
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLogin;

    public void clickManagerLogin() {
        clickOnElement(managerLogin);
      log.info("click on login " + managerLogin.toString());

    }
}
