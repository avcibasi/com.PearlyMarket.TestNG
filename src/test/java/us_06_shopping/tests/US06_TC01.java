package us_06_shopping.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import us_06_shopping.pages.CartPage;
import us_06_shopping.pages.CheckoutPage;
import us_06_shopping.pages.HomePage;
import us_06_shopping.pages.ProductsPage;
import utilities.*;

import java.util.ArrayList;
import java.util.List;

public class US06_TC01 {
    /*
    1_Go to https://pearlymarket.com/
    2_Locate the searchbar input
    3_Type three different products in the searchbar (Iphone, Lego, Camera) and click on search icon
    4_Click on "Add to Cart" button for 2 items for each product
    5_Assert that "...added to your cart." message is displayed.
    6_Click on "cart" and then "view cart" buttons
    7_Verify that products are displayed in the cart
    8_Click on "+" and/or "-" icons  and "update cart"
    9_Assert that "Cart updated." message is displayed.//
    10_Click on "Proceed to Checkout" button
    11_Verify that Billing Address and Payment Options are displayed
    12_Fill the necessary inputs and select payment method
    13_Click on "Place Order" button
     */

    @Test
    public void US06_TC01() throws Exception {
//  Go to https://pearlymarket.com/
        Driver.getDriver().get("https:pearlymarket.com");

        HomePage homePage = new HomePage();
        ProductsPage productsPage = new ProductsPage();
        CartPage cartPage = new CartPage();
        CheckoutPage checkoutPage = new CheckoutPage();

        SoftAssert softAssert = new SoftAssert();

//  Type three different products in the searchbar (Iphone, Lego, Camera) and click on search icon
//  Click on "Add to Cart" button for 2 items for each product
//  Assert that "...added to your cart." message is displayed.
        List<String> desiredProducts = new ArrayList<>();
        desiredProducts.add("Iphone");
        desiredProducts.add("Lego");
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
