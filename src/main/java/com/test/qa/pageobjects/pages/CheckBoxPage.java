package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * CheckBoxPage.java - class to verify CheckBox Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class CheckBoxPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(CheckBoxPage.class);

    private  static By hdrCheckBox = By.xpath("//h3[text()='Checkboxes']");
    private static By checkBox1 = By.xpath("(//input[@type='checkbox'])[1]");
    private static By checkBox2 = By.xpath("(//input[@type='checkbox'])[2]");

    /**
     *
     * @return boolean
     */
    public static boolean isCheckBoxPageDisplayed() {
        return getDriver().findElement(hdrCheckBox).isDisplayed();
    }

    public static boolean isCheckBox1Displayed() {
        return getDriver().findElement(checkBox1).isDisplayed();
    }

    public static void checkCheckBox1() {
        WebElement checkbox = getDriver().findElement(checkBox1);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void unCheckCheckBox1() {
        WebElement checkbox = getDriver().findElement(checkBox1);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static boolean isCheckBox1Checked() {
        return getDriver().findElement(checkBox1).isSelected();
    }

    public static boolean isCheckBox2Displayed() {
        return getDriver().findElement(checkBox2).isDisplayed();
    }

    public static void checkCheckBox2() {
        WebElement checkbox = getDriver().findElement(checkBox2);
        if (!checkbox.isSelected())
            checkbox.click();
    }

    public static void unCheckCheckBox2() {
        WebElement checkbox = getDriver().findElement(checkBox2);
        if (checkbox.isSelected())
            checkbox.click();
    }

    public static boolean isCheckBox2Checked() {
        return getDriver().findElement(checkBox2).isSelected();
    }
}
