package user_story_20.tests;

import org.testng.annotations.Test;
import user_story_20.pages.CartPage;
import user_story_20.pages.CouponPage;
import user_story_20.pages.LoginPage;
import user_story_20.pages.MyAccountPage;
import utilities.*;
import java.io.IOException;
public class TC_02 {
    @Test
    public void testCase02() throws IOException {
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
//        Verify "My Account" title is displayed
        ReusableMethods.verifyElementDisplayed(myAccountPage.myAccountTitle);
//        User clicks on "ORDERS" option
        myAccountPage.ordersOption.click();
        WaitUtils.waitFor(2);
//        "Orders" text should be displayed
        ReusableMethods.verifyElementDisplayed(myAccountPage.ordersTitle);
//        User clicks on "VIEW" button
        myAccountPage.viewButton.click();
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(2);
//        User should be able to see "ORDER DETAILS" text
        ReusableMethods.verifyElementDisplayed(myAccountPage.orderDetailsTitle);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        Driver.closeDriver();
    }
}

