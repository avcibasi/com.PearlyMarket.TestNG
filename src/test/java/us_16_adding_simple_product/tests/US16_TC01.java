package us_16_adding_simple_product.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import us_16_adding_simple_product.pages.AddProductPage;
import us_16_adding_simple_product.pages.HomePage;
import us_16_adding_simple_product.pages.MyAccountPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.awt.*;
import java.io.IOException;

public class US16_TC01 {
    /*
    1_Go to https://pearlymarket.com/
    2_Click on Sign in button
    3_Enter username, password and click on sign in submit button: username:theospecters@gmail.com, pass: TheoSpecter
    4_Click on "My Account" button
    5_Click on "Store Manager" button.
    6_Hover over "Products" and click on "Add New" button
    7_Assert that "Simple Product" is selected as default in products dropdown.
    8_Assert that Virtual and Downloadable checkbox buttons are displayed and clickable.
    9_Fill product title, price and sale price inputs (carpet, 100, 90).
    10_Select the given categories (Home & Garden,home accessories, Home&Life)
    11_Upload "Featured img" and "Gallery Images"
    12_Click on "Submit" button and assert "Published" message is displayed
    13_Click on "Products" and assert that newly added product is displayed
     */

    @Test
    public void US16_TC01() throws IOException, AWTException {
//  Go to https://pearlymarket.com/
        Driver.getDriver().get("https://pearlymarket.com/");

//  Click on Sign in button
        HomePage homePage = new HomePage();
        homePage.signInButton.click();
        WaitUtils.waitFor(3);

//  Enter username, password and click on sign in submit button: username:theospecters@gmail.com, pass: TheoSpecter
        homePage.usernameInput.sendKeys("theospecter@gmail.com");
        homePage.passwordInput.sendKeys("TheoSpecter");
        homePage.signInSubmitButton.click();

//  Click on "My Account" button
        JSUtils.clickWithTimeoutByJS(homePage.myAccountLink);

//  Click on "Store Manager" button
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.storeManagerLink.click();

//  Hover over "Products" and click on "Add New" button
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(myAccountPage.productsLink).perform();
        JSUtils.clickWithTimeoutByJS(myAccountPage.addProductLink);

//  Assert that "Simple Product" is selected as default in products dropdown
        AddProductPage addProductPage = new AddProductPage();

        Assert.assertTrue(addProductPage.productTypeDropdown.isDisplayed());
        Assert.assertTrue(addProductPage.simpleProductOption.getText().contains("Simple Product"));

//  Assert that Virtual and Downloadable checkbox buttons are displayed and clickable
        Assert.assertTrue(addProductPage.virtualCheckbox.isDisplayed());
        Assert.assertTrue(addProductPage.downloadableCheckbox.isDisplayed());

//  Fill product title, price and sale price inputs (carpet, 100, 90)
        addProductPage.productTitleInput.sendKeys("carpet");
        addProductPage.priceInput.sendKeys("100");
        addProductPage.salePriceInput.sendKeys("80");

//  Select the given categories (Home & Garden,home accessories, Home&Life)
        JSUtils.clickWithTimeoutByJS(addProductPage.homeGardenCheckbox);
        JSUtils.clickWithTimeoutByJS(addProductPage.homeAccessoriesCheckbox);
        JSUtils.clickWithTimeoutByJS(addProductPage.homeLifeCheckbox);

//  Upload "Featured img" and "Gallery Images"
        addProductPage.featuredImageInput.click();
        addProductPage.mediaLibraryButton.click();
        addProductPage.image.click();
        JSUtils.clickWithTimeoutByJS(addProductPage.imageSubmitButton);

        JSUtils.clickWithTimeoutByJS(addProductPage.galleryImageInput);
        //addProductPage.mediaLibraryButton.click();
        JSUtils.clickWithTimeoutByJS(addProductPage.image2);
        JSUtils.clickWithTimeoutByJS(addProductPage.imageGallerySubmitButton);

//  Click on "Submit" button and assert "Published" message is displayed
        JSUtils.clickWithTimeoutByJS(addProductPage.submitButton);
        Assert.assertTrue(addProductPage.publishedMessage.isDisplayed());

//  Click on "Products" and assert that newly added product is displayed
        myAccountPage.productsLink.click();

        int listOfAddedProducts = addProductPage.listOfAddedProducts.findElements(By.xpath("//td")).size();
        System.out.println("listOfAddedProducts = " + listOfAddedProducts);
        Assert.assertTrue(listOfAddedProducts>1);
        Driver.closeDriver();
   }
}
