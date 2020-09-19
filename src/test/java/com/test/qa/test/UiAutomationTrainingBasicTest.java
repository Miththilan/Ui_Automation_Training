package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 1)
	public void testVerifyHomePage() {
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.AB_TEST_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 2)
	public void testVerifyHomePage2() {
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
		//Todo - Click Home Page Link
		//Todo - Static wait
		//Todo - Wait Till Page Loads
		//Todo - Static wait
		//Todo - Verify ABTest Page is displayed
		//Todo - Static wait
		//Todo - Navigate Back to Home Page
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 3)
	public void testVerifyCheckBox() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Check Box Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Check Box 1 is displayed
        //Todo - Verify Check Box 2 is displayed
        //Todo - Check Check Box 1
        //Todo - Verify Check Box 1 is Checked
        //Todo - Uncheck Check Box 1
        //Todo - Verify Check Box 1 is Unchecked
        //Todo - Check Check Box 2
        //Todo - Verify Check Box 2 is Checked
        //Todo - Uncheck Check Box 2
        //Todo - Verify Check Box 2 is Unchecked
        //Todo - Navigate Back to Home Page
        //Todo - Verify HomePage is displayed

		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.CHECK_BOX_LINK);
		softAssert.assertTrue(CheckBoxPage.isCheckBoxPageDisplayed(), "Check Box Page is not getting displayed");
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Displayed(), "CheckBox1 is not Displayed");
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Displayed(), "CheckBox2 is not Displayed");
		CheckBoxPage.checkCheckBox1();
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Checked(), "CheckBox1 is not Checked");
		CheckBoxPage.unCheckCheckBox1();
		softAssert.assertFalse(CheckBoxPage.isCheckBox1Checked(), "CheckBox1 is Checked");
		CheckBoxPage.checkCheckBox2();
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Checked(), "CheckBox2 is not Checked");
		CheckBoxPage.unCheckCheckBox2();
		softAssert.assertFalse(CheckBoxPage.isCheckBox2Checked(), "CheckBox2 is Checked");
		CheckBoxPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = { "test", "regression"}, priority = 4)
	public void testVerifyDropDown() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Drop Down Link
        //Todo - Wait Till Page Loads
        //Todo - Verify Drop Down is displayed
        //Todo - Select Drop Down Option 1
        //Todo - Verify Drop Down Option 1 selected
        //Todo - Select Drop Down Option 2
        //Todo - Verify Drop Down Option 2 selected

		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.DROP_DOWN_LINK);
		softAssert.assertTrue(DropDownPage.isDropDownDisplayed(), "DropDown is not Displayed");
		DropDownPage.setDropDownOption(Constants.OPTION_1);
		softAssert.assertEquals(DropDownPage.getSelectedOption(), Constants.OPTION_1, "DropDown value is incorrect");
		DropDownPage.setDropDownOption(Constants.OPTION_2);
		softAssert.assertEquals(DropDownPage.getSelectedOption(), Constants.OPTION_2, "DropDown value is incorrect");
		softAssert.assertAll();
	}

	/**
	 * Verify Forgot Password
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 5)
	public void testVerifyForgotPassword() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Forgot Password Link
        //Todo - Set Sample Mail
        //Todo - Click Submit
        //Todo - Verify Forgot Password Message

		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.FORGOT_PASSWORD_LINK);
		ForgotPasswordPage.setEmail(Constants.SAMPLE_MAIL);
		ForgotPasswordPage.clickSubmit();
		softAssert.assertEquals(ForgotPasswordPage.getResult(), Constants.EMAIL_RESULT,"Email Submit Result is incorrect");
		softAssert.assertAll();
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "test", priority = 6)
	public void testVerifyLogin() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Username and Password
        //Todo - Click Submit
        //Todo - Verify Login Secure Page Displayed
        //Todo - Verify Login Alert Displayed
        //Todo - Verify Login  Alert Message Content
        //Todo - Click Logout
        //Todo - Verify Login Page Displayed
        //Todo - Verify Logout Alert Displayed
        //Todo - Verify Logout  Alert Message Content
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = "test", priority = 7)
	public void testVerifyInvalidLogin() {
        //Todo - Verify HomePage is displayed
        //Todo - Click Login Link
        //Todo - Set Invalid Username and Password
        //Todo - Click Submit
        //Todo - Verify Invalid Login Alert Displayed
        //Todo - Verify Invalid Login  Alert Message Content
	}
}
