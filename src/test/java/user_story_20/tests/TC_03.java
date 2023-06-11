package user_story_20.tests;

import org.testng.annotations.Test;
import user_story_20.pages.CartPage;
import user_story_20.pages.CouponPage;
import user_story_20.pages.LoginPage;
import user_story_20.pages.MyAccountPage;
import utilities.*;
import java.io.IOException;
public class TC_03 {
    @Test
    public void testCase03() throws IOException {
//        Go to website https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(2);
        CartPage cartPage = new CartPage();
        LoginPage loginPage = new LoginPage();
        CouponPage couponPage = new CouponPage();
        MyAccountPage myAccountPage = new MyAccountPage();
//        User verifies "Pearly Market" title is displayed
        ReusableMethods.verifyElementDisplayed(loginPage.pearlyMarketText);
//        User clicks on "Sign In" button
        loginPage.loginButton.click();
        WaitUtils.waitFor(2);
//        User fill the "Username or email address", "Password" and clicks on "SIGN IN" button
        loginPage.username.sendKeys("seyhany844@gmail.com");
        loginPage.password.sendKeys("Afghanistan1919$");
        loginPage.singINButton.click();
//        Verify user has logged in to his account
        ReusableMethods.verifyElementDisplayed(loginPage.signInVerification);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
//        User clicks on "My Account" option
        ReusableMethods.clickWithTimeOut(myAccountPage.myAccountButton,10);
        WaitUtils.waitFor(2);
//        Verify " My Account" is displayed
        ReusableMethods.verifyElementDisplayed(myAccountPage.myAccountTitle);
//        User clicks on "Store Manager" option
        couponPage.storeManager.click();
        WaitUtils.waitFor(2);
//        Verify "Store Manager" is displayed
        ReusableMethods.verifyElementDisplayed(couponPage.storeManagerTitle);
//        User clicks on " Coupons" button and after clicks on "Add New"
        ReusableMethods.clickWithTimeOut(couponPage.couponButton,10);
        WaitUtils.waitFor(2);
        couponPage.addNewButton.click();
        WaitUtils.waitFor(2);
//        User should be able to fill all the details of the new coupon to create a new coupon
        couponPage.couponCode.sendKeys("Q1856");
        couponPage.description.sendKeys("This coupon will be used for the electronic items");
        couponPage.amount.sendKeys("50");
        couponPage.expiryDate.sendKeys("12/12/2023");
        couponPage.minSpend.sendKeys("10");
        couponPage.maxSpend.sendKeys("50");
        WaitUtils.waitFor(2);
//        User clicks on "SUBMIT" button
        ReusableMethods.clickWithTimeOut(couponPage.submitButton,5);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        Driver.closeDriver();
    }
}