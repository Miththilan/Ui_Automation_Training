package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * DropDownPage.java - class to verify DropDown Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class DropDownPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(DropDownPage.class);

    private static By dropDown = By.id("dropdown");

    public static boolean isDropDownDisplayed() {
        return getDriver().findElement(dropDown).isDisplayed();
    }

    public static String getSelectedOption() {
        Select dropDownOption = new Select(getDriver().findElement(dropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }

    public static void setDropDownOption(String option) {
        Select dropDownOption = new Select(getDriver().findElement(dropDown));
        dropDownOption.selectByVisibleText(option);
    }
}
