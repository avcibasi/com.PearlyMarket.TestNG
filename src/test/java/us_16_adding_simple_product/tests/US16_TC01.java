package us_16_adding_simple_product.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import us_16_adding_simple_product.pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;


import java.io.IOException;

public class US16_TC01 {
    /*
    1_Go to https://pearlymarket.com/
    2_Click on Sign in button
    3_Enter username, password and click on sign in submit button: username:ts@gmail.com, pass: TS
2_Click on "My Account", "Store Manager" buttons.
3_Hover over "Products" and click on "Add New" button
4_Assert that "Simple Product" is selected as default in products dropdown.
5_Assert that Virtual and Downloadable checkbox buttons are displayed and clickable.

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
    public void US16_TC01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("pearly_url"));

        HomePage homePage = new HomePage();




        Driver.closeDriver();
   }
}
