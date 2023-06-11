package user_story_20.tests;

import org.testng.annotations.Test;
import user_story_20.pages.CartPage;
import user_story_20.pages.CouponPage;
import user_story_20.pages.LoginPage;
import user_story_20.pages.MyAccountPage;
import utilities.*;
import java.io.IOException;

public class TC_01 {
    @Test
    public void testCase01() throws IOException {
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
//        Verify that user has successfully logged in to his account
        ReusableMethods.verifyElementDisplayed(loginPage.signInVerification);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(2);
//        Search bar should be displayed and enable
        ReusableMethods.verifyElementDisplayed(loginPage.searchBar);
//        User clicks on search bar
        loginPage.searchBar.click();
//        User search for "Gray Leather Shoes"
        loginPage.searchBar.sendKeys("Gray Leather Shoes");
//        User clicks on the searched element
        loginPage.searchedItemSubmitButton.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
//        Verify "Gray Leather Shoes" title is displayed
        ReusableMethods.verifyElementDisplayed(loginPage.grayLeatherShoesText);
//        Verify "ADD TO CART" button is displayed and clickable
        ReusableMethods.verifyElementDisplayed(loginPage.addToCartButton);
//        User clicks on "ADD TO CART" button
        loginPage.addToCartButton.click();
        WaitUtils.waitFor(2);
//        User clicks on the "Cart" notification option
        cartPage.cartOption.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
//        Verify that the "SHOPPING CART" title is displayed
        ReusableMethods.verifyElementDisplayed(cartPage.shoppingCartTitle);
//        User clicks on "CHECKOUT" button
        cartPage.checkoutButton.click();
        WaitUtils.waitFor(2);
//        Verify the "YOUR ORDER" title
        ReusableMethods.verifyElementDisplayed(cartPage.yourOrderTitle);
//        User fills the "BILLING DETAILS"
        cartPage.firstName.sendKeys("Shahrokh");
        cartPage.lastName.sendKeys("Majidi");
        cartPage.companyName.sendKeys("techpro");
        cartPage.streetAddress.sendKeys("vournova");
        cartPage.homeNumber.sendKeys("25");
        cartPage.townCity.sendKeys("nikaia");
        cartPage.postcodeZip.sendKeys("18452");
        cartPage.phone.sendKeys("6936747348");
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
//        cartPage.emailAddress.sendKeys("shahrukhmajidi0987@gmail.com");
//        WebElement dropdown = Driver.getDriver().findElement(By.id("select2-billing_country-container"));
//        Select options = new Select(dropdown);
//        options.selectByVisibleText("Greece");
//        WebElement dropdown1 = Driver.getDriver().findElement(By.id("select2-billing_state-container"));
//        Select options1 = new Select(dropdown1);
//        options1.selectByVisibleText("Attica");
        WaitUtils.waitFor(2);
//        Verify "Total" is displayed
        ReusableMethods.verifyElementDisplayed(cartPage.totalAmount);
//        User should be able to select the "Wire transfer/EFT" option
//        WebElement checkBox1 = Driver.getDriver().findElement(By.id("payment_method_bacs"));
//        //is checkbox1 is already selected
//        boolean isCheckBox1Selected = checkBox1.isSelected();

//        By clicking on Place Order, the user should be able to see that the shopping has been completed
//        Driver.getDriver().findElement(By.xpath("//button[@id='place_order']")).click();
        JSUtils.clickWithTimeoutByJS(cartPage.placeOrder);
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        Driver.closeDriver();
    }
}
