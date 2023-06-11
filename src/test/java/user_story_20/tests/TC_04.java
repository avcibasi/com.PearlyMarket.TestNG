package user_story_20.tests;

import org.testng.annotations.Test;
import user_story_20.pages.CartPage;
import user_story_20.pages.CouponPage;
import user_story_20.pages.LoginPage;
import user_story_20.pages.MyAccountPage;
import utilities.*;
import java.io.IOException;
public class TC_04 {
    @Test
    public void testCase04() throws IOException {
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
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(2);
//        User clicks on search bar
        loginPage.searchBar.click();
        WaitUtils.waitFor(2);
//        User search for "Mouse"
        loginPage.searchBar.sendKeys("mouse");
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(2);
//        User clicks on the searched element
        loginPage.searchedItemSubmitButton.click();
        WaitUtils.waitFor(2);
//        User clicks on the first searched mouse
        loginPage.mouse.click();
//        Verify "mouse" title is displayed
        ReusableMethods.verifyElementDisplayed(loginPage.mouseTitle);
//        User clicks on  "ADD TO CART" button
        loginPage.addToCartButton.click();
//        User clicks on the "Cart" notification option
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        cartPage.cartOption.click();
        WaitUtils.waitFor(2);
//        Verify that the "SHOPPING CART" title is displayed
        ReusableMethods.verifyElementDisplayed(cartPage.shoppingCartTitle);
//        User clicks on "PROCEED TO CHECKOUT" button
        cartPage.checkoutButton.click();
        WaitUtils.waitFor(2);
//        Verify the "Have a coupon? ENTER YOUR CODE" option
        ReusableMethods.verifyElementDisplayed(cartPage.haveACouponText);
//        User clicks on "ENTER YOUR CODE" option
        cartPage.haveACouponOption.click();
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
//        User clicks on "coupon code" box and types the coupon
        cartPage.couponCodeSearchBox.sendKeys("Q1856");
//        User clicks "APPLY COUPON" button
        cartPage.applyCouponButton.click();
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        Driver.closeDriver();
    }
}