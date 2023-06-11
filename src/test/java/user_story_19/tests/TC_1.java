package user_story_19.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import user_story_1.pages.HomePage;
import user_story_19.pages.CartPage;
import user_story_19.pages.CheckoutPage;
import user_story_19.pages.LoginPage;
import user_story_19.pages.ProductsPage;
import utilities.*;

import java.util.ArrayList;
import java.util.List;

public class TC_1 {



        @Test
        public void US06_TC01() throws Exception {
//  Go to https://pearlymarket.com/
            Driver.getDriver().get("https:pearlymarket.com");
            LoginPage loginPage = new LoginPage();
            loginPage.loginButton.click();
            WaitUtils.waitFor(2);
//        User fill the "Username or email address", "Password" and clicks on "SIGN IN" button
            loginPage.username.sendKeys("pearly_market@outlook.com");
            loginPage.password.sendKeys("pm_project_pm");
            loginPage.singINButton.click();
//        Verify user has logged in to his account
            ReusableMethods.verifyElementDisplayed(loginPage.signInVerification);
            WaitUtils.waitFor(2);

            HomePage homePage = new HomePage();
            ProductsPage productsPage = new ProductsPage();
            CartPage cartPage = new CartPage();
            CheckoutPage checkoutPage = new CheckoutPage();

            SoftAssert softAssert = new SoftAssert();


            List<String> desiredProducts = new ArrayList<>();
            desiredProducts.add("Iphone");
            desiredProducts.add("Watch");
            desiredProducts.add("Camera");

            for(String w:desiredProducts){
                homePage.searchBar.sendKeys(w);
                homePage.searchButton.click();
                // productsPage.firstProduct.click();
                //Driver.getDriver().navigate().back();
                productsPage.secondProduct.click();
                JSUtils.clickWithTimeoutByJS(productsPage.addToCartButton);
                softAssert.assertTrue(productsPage.addedToCartMessage.isDisplayed());
                //Driver.getDriver().navigate().back();
                //JSUtils.clickWithTimeoutByJS(productsPage.thirdProduct);
                //JSUtils.clickWithTimeoutByJS(productsPage.addToCartButton);
                softAssert.assertTrue(productsPage.addedToCartMessage.isDisplayed());
            }

//      ************* "Add to cart" button is not displayed for the first product when you type "Iphone" in the searchbar (Iphone130).
            homePage.searchBar.sendKeys("Iphone");
            homePage.searchButton.click();

            productsPage.firstProduct.click();
            //ReusableMethods.verifyElementNotDisplayed(productsPage.addToCartButton);

            MediaUtils.takeScreenshotOfTheEntirePageAsString();//no "add to cart" button

//  Click on "cart" and then "view cart" buttons
            homePage.cartButton.click();
            JSUtils.clickWithTimeoutByJS(homePage.viewCartButton);

//  Verify that products are displayed in the cart
            ReusableMethods.verifyElementDisplayed(cartPage.cartProductTable);

//  Click on "+" and/or "-" icons  and "update cart"
            cartPage.product1QuantityIncreaseButton.click();
            WaitUtils.waitFor(2);
            cartPage.product1QuantityDecreaseButton.click();
            WaitUtils.waitFor(2);
            JSUtils.clickWithTimeoutByJS(cartPage.updateCartButton);
            WaitUtils.waitFor(3);
            //ReusableMethods.verifyElementDisplayed(cartPage.cartUpdatedMessage);

//  Click on "Proceed to Checkout" button
            JSUtils.clickWithTimeoutByJS(cartPage.proceedToCheckOutButton);

//  Verify that Billing Address and Payment Options are displayed
            ReusableMethods.verifyElementDisplayed(checkoutPage.billingDetailsText);
            ReusableMethods.verifyElementDisplayed(checkoutPage.paymentMethodssText);
            //ReusableMethods.verifyElementDisplayed(checkoutPage.wireTransferRadioButton);
            softAssert.assertTrue(checkoutPage.wireTransferRadioButton.isSelected());

//  Fill the necessary inputs and select payment method
            Faker faker = new Faker();

            checkoutPage.firstNameInput.sendKeys(faker.name().firstName());
            checkoutPage.lastNameInput.sendKeys(faker.name().lastName());

            Select selectCountry = new Select(checkoutPage.countryDropdown);
            selectCountry.selectByVisibleText("United States (US)");

            checkoutPage.adressInput.sendKeys(faker.address().streetAddress());
            checkoutPage.cityInput.sendKeys(faker.address().city());

            Select selectState = new Select(checkoutPage.stateDropdown);
            selectState.selectByVisibleText("New York");
            checkoutPage.zipCodeInput.sendKeys(faker.address().zipCode());
            checkoutPage.phoneInput.sendKeys(faker.phoneNumber().phoneNumber());
            checkoutPage.emailInput.sendKeys(faker.internet().emailAddress());

//  Make the payment and click on "Place Order" button
            JSUtils.clickWithTimeoutByJS(checkoutPage.payAtTheDoorRadioButton);
            JSUtils.clickWithTimeoutByJS(checkoutPage.placeOrderButton);

            Driver.closeDriver();
        }
    }

