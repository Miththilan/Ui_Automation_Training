package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * ForgotPasswordPage.java - class to verify ForgotPassword Page functions
 * Created by SrirankanK on 10/3/2018.
 */
public class ForgotPasswordPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(ForgotPasswordPage.class);

    private static By txtEmail = By.id("email");
    private static By btnSubmit = By.id("form_submit");
    private static By lblResult = By.id("content");

    public static  void  setEmail(String email){
        getDriver().findElement(txtEmail).sendKeys(email);
    }

    public static void clickSubmit(){
        getDriver().findElement(btnSubmit).click();
    }

    public static String getResult(){
        waiTillVisible(lblResult,10);
        return getDriver().findElement(lblResult).getText();
    }
}
