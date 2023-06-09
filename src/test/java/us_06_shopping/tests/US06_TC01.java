package us_06_shopping.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import us_06_shopping.pages.CartPage;
import us_06_shopping.pages.CheckoutPage;
import us_06_shopping.pages.HomePage;
import us_06_shopping.pages.ProductsPage;
import us_06_shopping.utilities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class US06_TC01 {
    /*
    1_Go to https://pearlymarket.com/
    2_Locate the searchbar input
    3_Type three different products in the searchbar (Iphone, Lego, Camera) and click on them
    4_Click on "Add to Cart" button
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
    public void US06_TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));
        HomePage homePage = new HomePage();
        ProductsPage productsPage = new ProductsPage();
        CartPage cartPage = new CartPage();
        CheckoutPage checkoutPage = new CheckoutPage();

        SoftAssert softAssert = new SoftAssert();

/*        List<String> desiredProducts = new ArrayList<>();
        desiredProducts.add("Iphone");
        desiredProducts.add("Lego");
        desiredProducts.add("Camera");

        for(String w:desiredProducts){
            homePage.searchBar.sendKeys(w);
            homePage.searchButton.click();
            productsPage.secondProduct.click();
            JSUtils.clickWithTimeoutByJS(productsPage.addToCartButton);
            softAssert.assertTrue(productsPage.addedToCartMessage.isDisplayed());
        }*/

//Iphone second product in the list
        homePage.searchBar.sendKeys("Iphone");
        homePage.searchButton.click();

        productsPage.secondProduct.click();
        JSUtils.clickWithTimeoutByJS(productsPage.addToCartButton);
//        softAssert.assertTrue(productsPage.addedToCartMessage.isDisplayed());

//Iphone third product in the list
//        homePage.searchBar.sendKeys("Iphone");
//        homePage.searchButton.click();
//
//        productsPage.thirdProduct.click();
//        JSUtils.clickWithTimeoutByJS(productsPage.addToCartButton);
//        softAssert.assertTrue(productsPage.addedToCartMessage.isDisplayed());

//Iphone first product in the list
/*        homePage.searchBar.sendKeys("Iphone");
        homePage.searchButton.click();

        productsPage.firstProduct.click();
        ReusableMethods.verifyElementNotDisplayed(productsPage.addToCartButton);

        MediaUtils.takeScreenshotOfTheEntirePageAsString();//no "add to cart" button*/

//      Navigating to cart page
        homePage.cartButton.click();
        homePage.viewCartButton.click();

        ReusableMethods.verifyElementDisplayed(cartPage.cartProductTable);

        cartPage.product1QuantityIncreaseButton.click();
        WaitUtils.waitFor(2);
        cartPage.product1QuantityDecreaseButton.click();
        WaitUtils.waitFor(2);
        JSUtils.clickWithTimeoutByJS(cartPage.updateCartButton);
        WaitUtils.waitFor(3);
        //ReusableMethods.verifyElementDisplayed(cartPage.cartUpdatedMessage);

        JSUtils.clickWithTimeoutByJS(cartPage.proceedToCheckOutButton);

        ReusableMethods.verifyElementDisplayed(checkoutPage.billingDetailsText);
        ReusableMethods.verifyElementDisplayed(checkoutPage.paymentMethodssText);
        //ReusableMethods.verifyElementDisplayed(checkoutPage.wireTransferRadioButton);
        softAssert.assertTrue(checkoutPage.wireTransferRadioButton.isSelected());

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

        JSUtils.clickWithTimeoutByJS(checkoutPage.payAtTheDoorRadioButton);
        JSUtils.clickWithTimeoutByJS(checkoutPage.placeOrderButton);

        Driver.closeDriver();
   }
}
