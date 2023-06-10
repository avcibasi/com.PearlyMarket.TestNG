package user_story_8.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_8.pages.PearlyCheckoutPage;
import user_story_8.pages.PearlyHomePage;
import utilities.Driver;
import utilities.WaitUtils;

public class PearlyUS08 {

    /*
        The user should be able to add her/his favorite items to her/his Wishlist.
        The user should be able to view the items added to the Wishlist.
        The user should be able to view the items added to the Wishlist.
        The user should be able to add the items on their Wishlist to their cart and purchase.
     */
    PearlyHomePage pearlyHomePage = new PearlyHomePage();
    PearlyCheckoutPage pearlyCheckoutPage = new PearlyCheckoutPage();


    @Test
    public void US08_TC001_wishListTest1() {

        //The user should be able to add her/his favorite items to her/his Wishlist.
        //The user should be able to view the items added to the Wishlist.

        //Navigate to homepage "https://pearlymarket.com/"
        Driver.getDriver().get("https://pearlymarket.com/");

        pearlyHomePage.theFirstTrendingLink.click();



        //Hover over Men link
        WebElement linkMen = pearlyHomePage.linkMen;

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(linkMen).perform();
        WaitUtils.waitFor(3);

        //Click on Shoes link under Men link
        WaitUtils.waitForVisibility(pearlyHomePage.linkShose, 10).click();
        WaitUtils.waitFor(3);

        //Hover over on Adidas Erkek Ayakkabı product
        actions.moveToElement(pearlyHomePage.adidasErkekAyakkabi).perform();
        WaitUtils.waitFor(3);

        //Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product

        actions.moveToElement(pearlyHomePage.wishListIconForShose).perform();
        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
        pearlyHomePage.wishListIconForShose.click();

//        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();",pearlyHomePage.wishListIconForShose);

        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist
        pearlyHomePage.wishlistIcon.click();
        WaitUtils.waitFor(3);


        Assert.assertTrue(pearlyHomePage.addToCartButton.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void US08_TC002_wishListTest2() {
        //The user should be able to view the items added to the Wishlist(QUICK VIEW).
        //Wishlistteki ürünlerin özelliklerini görüntüleyebilmeli (QUICK VIEW)


        //Navigate to homepage "https://pearlymarket.com/"
        Driver.getDriver().get("https://pearlymarket.com/");


        //Hover over Men link
        WebElement linkMen = pearlyHomePage.linkMen;

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(linkMen).perform();
        WaitUtils.waitFor(3);

        //Click on Shoes link under Men link
        WaitUtils.waitForVisibility(pearlyHomePage.linkShose, 10).click();
        WaitUtils.waitFor(3);

        //Hover over on Adidas Erkek Ayakkabı product
        actions.moveToElement(pearlyHomePage.adidasErkekAyakkabi).perform();
        WaitUtils.waitFor(3);

        //Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product

        actions.moveToElement(pearlyHomePage.wishListIconForShose).perform();
        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
        pearlyHomePage.wishListIconForShose.click();

//        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();",pearlyHomePage.wishListIconForShose);

        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist
        pearlyHomePage.wishlistIcon.click();
        WaitUtils.waitFor(3);

        //Click on Quick View button to see the properties of the product you added to Wishlist
        pearlyHomePage.quickViewButton.click();
        WaitUtils.waitFor(5);

        System.out.println("pearlyHomePage.addToCartButtonOnQuickView.getText() = " + pearlyHomePage.addToCartButtonOnQuickView.getText());

        //Verify user can be able to see  the properties of the product user added to Wishlist by the help  Quick View button

        Assert.assertTrue(pearlyHomePage.addToCartButtonOnQuickView.isDisplayed());
        Assert.assertEquals("ADD TO CART", pearlyHomePage.addToCartButtonOnQuickView.getText());


        Driver.closeDriver();


    }

    @Test
    public void US08_TC003_wishListTest3() {

        //Whishlisteki ürünüsepete ekleyebilmeli ve satın alabilmeli


        //Navigate to homepage "https://pearlymarket.com/"
        Driver.getDriver().get("https://pearlymarket.com/");


        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        //Hover over Men link
        WebElement linkMen = pearlyHomePage.linkMen;

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(linkMen).perform();
        WaitUtils.waitFor(3);

        //Click on Shoes link under Men link
        WaitUtils.waitForVisibility(pearlyHomePage.linkShose, 10).click();
        WaitUtils.waitFor(3);

        //Hover over on Adidas Erkek Ayakkabı product
        actions.moveToElement(pearlyHomePage.adidasErkekAyakkabi).perform();
        WaitUtils.waitFor(3);

        //Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product

        actions.moveToElement(pearlyHomePage.wishListIconForShose).perform();
        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
        pearlyHomePage.wishListIconForShose.click();

//        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();",pearlyHomePage.wishListIconForShose);

        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist
        pearlyHomePage.wishlistIcon.click();
        WaitUtils.waitFor(3);


        //Click on Add To Cart button to add the product you selected to Cart
        pearlyHomePage.addToCartButton.click();
        WaitUtils.waitFor(15);

        //Click on Cart Icon on homepage to see checkout for payment
        pearlyHomePage.chartIcon.click();
        WaitUtils.waitFor(5);

        //Click on checkout button to pay for the product
        pearlyHomePage.checkoutButton.click();
        WaitUtils.waitFor(5);

        //Fill in the relevant blanks in BILLING DETAILS
        Faker faker = new Faker();
        //Enter firstname
        pearlyCheckoutPage.customerName.sendKeys(faker.name().firstName());
        WaitUtils.waitFor(3);
        //Enter lastname
        pearlyCheckoutPage.customerLastName.sendKeys(faker.name().lastName());
        WaitUtils.waitFor(3);

        //Enter company name
        pearlyCheckoutPage.companyName.sendKeys(faker.company().name());
        WaitUtils.waitFor(3);

        //Select Country/Region as Slovakia
        WebElement dropDownCountyRegion = pearlyCheckoutPage.countryRegion;
        Select select = new Select(dropDownCountyRegion);
        select.selectByVisibleText("Slovakia");
        WaitUtils.waitFor(3);

        //Enter street address(address1)
        pearlyCheckoutPage.streetAddress1.sendKeys(faker.address().fullAddress());
        WaitUtils.waitFor(2);

        //Enter street address(address2)
        pearlyCheckoutPage.streetAddress2.sendKeys(faker.address().secondaryAddress());
        WaitUtils.waitFor(2);
        //Enter Postcode/ZIP
        pearlyCheckoutPage.zipCode.sendKeys(faker.address().zipCode());
        WaitUtils.waitFor(2);
        //Enter Town/city
        pearlyCheckoutPage.townCity.sendKeys(faker.address().cityName());
        WaitUtils.waitFor(2);
        //Enter phone number
        pearlyCheckoutPage.phone.sendKeys(faker.phoneNumber().phoneNumber());
        WaitUtils.waitFor(2);
        //Enter email address
        pearlyCheckoutPage.emailAddress.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(2);

        //Enter additional information for order if you want
        pearlyCheckoutPage.additionalInfo.sendKeys(faker.expression("I will be happy if it is delivered soon"));
        WaitUtils.waitFor(2);
        //Click on Pay at the door checkbox if box is not selected
        WebElement checkboxForPayAtTheDoor = pearlyCheckoutPage.checkboxForPayAtTheDoor;
        if (!checkboxForPayAtTheDoor.isSelected()) {
            WaitUtils.waitFor(3);
            checkboxForPayAtTheDoor.click();
        }

        //Click on place order button
        pearlyCheckoutPage.placeOrderButton.click();
        WaitUtils.waitFor(5);


        //Verify user order has been received

        Assert.assertEquals(pearlyCheckoutPage.orderDetailsText.getText(), "ORDER DETAILS");

        Driver.closeDriver();


    }


    @Test
    public void US08_TC004_wishListTest4() {

        //User can not see order details after clicking on place order button,
        //if the user does not fill in the relevant blanks which is marked asterisk sign(*) in BILLING DETAILS ( User skip to enter address and phone number)

        //Navigate to homepage "https://pearlymarket.com/"
        Driver.getDriver().get("https://pearlymarket.com/");


        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        //Hover over Men link
        WebElement linkMen = pearlyHomePage.linkMen;

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(linkMen).perform();
        WaitUtils.waitFor(3);

        //Click on Shoes link under Men link
        WaitUtils.waitForVisibility(pearlyHomePage.linkShose, 10).click();
        WaitUtils.waitFor(3);

        //Hover over on Adidas Erkek Ayakkabı product
        actions.moveToElement(pearlyHomePage.adidasErkekAyakkabi).perform();
        WaitUtils.waitFor(3);

        //Hover over Wishlist Icon that appears on Adidas Erkek Ayakkabı product

        actions.moveToElement(pearlyHomePage.wishListIconForShose).perform();
        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) that appears on Adidas Erkek Ayakkabı product to add product to wishlist
        pearlyHomePage.wishListIconForShose.click();

//        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
//        js.executeScript("arguments[0].click();",pearlyHomePage.wishListIconForShose);

        WaitUtils.waitFor(3);

        //Click on Wishlist Icon (Heart Sign) on the homepage to see the products you have added to the wishlist
        pearlyHomePage.wishlistIcon.click();
        WaitUtils.waitFor(3);


        //Click on Add To Cart button to add the product you selected to Cart
        pearlyHomePage.addToCartButton.click();
        WaitUtils.waitFor(15);

        //Click on Cart Icon on homepage to see checkout for payment
        pearlyHomePage.chartIcon.click();
        WaitUtils.waitFor(5);

        //Click on checkout button to pay for the product
        pearlyHomePage.checkoutButton.click();
        WaitUtils.waitFor(5);

        //Fill in the relevant blanks in BILLING DETAILS
        Faker faker = new Faker();
        //Enter firstname
        pearlyCheckoutPage.customerName.sendKeys(faker.name().firstName());
        WaitUtils.waitFor(3);
        //Enter lastname
        pearlyCheckoutPage.customerLastName.sendKeys(faker.name().lastName());
        WaitUtils.waitFor(3);

        //Enter company name
        pearlyCheckoutPage.companyName.sendKeys(faker.company().name());
        WaitUtils.waitFor(3);

        //Select Country/Region as Slovakia
        WebElement dropDownCountyRegion = pearlyCheckoutPage.countryRegion;
        Select select = new Select(dropDownCountyRegion);
        select.selectByVisibleText("Slovakia");
        WaitUtils.waitFor(3);

        //Enter street address(address1)
//        pearlyCheckoutPage.streetAddress1.sendKeys(faker.address().fullAddress());
//        WaitUtils.waitFor(2);

        //Enter street address(address2)
        pearlyCheckoutPage.streetAddress2.sendKeys(faker.address().secondaryAddress());
        WaitUtils.waitFor(2);
        //Enter Postcode/ZIP
        pearlyCheckoutPage.zipCode.sendKeys(faker.address().zipCode());
        WaitUtils.waitFor(2);
        //Enter Town/city
        pearlyCheckoutPage.townCity.sendKeys(faker.address().cityName());
        WaitUtils.waitFor(2);
        //Enter phone number
//        pearlyCheckoutPage.phone.sendKeys(faker.phoneNumber().phoneNumber());
//        WaitUtils.waitFor(2);
        //Enter email address
        pearlyCheckoutPage.emailAddress.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(2);

        //Enter additional information for order if you want
        pearlyCheckoutPage.additionalInfo.sendKeys(faker.expression("I will be happy if it is delivered soon"));
        WaitUtils.waitFor(2);
        //Click on Pay at the door checkbox if box is not selected
        WebElement checkboxForPayAtTheDoor = pearlyCheckoutPage.checkboxForPayAtTheDoor;
        if (!checkboxForPayAtTheDoor.isSelected()) {
            WaitUtils.waitFor(3);
            checkboxForPayAtTheDoor.click();
        }

        //Click on place order button
        pearlyCheckoutPage.placeOrderButton.click();
        WaitUtils.waitFor(5);


        //Verify user can not see order details because of skipping to enter required fields

        Assert.assertEquals(pearlyCheckoutPage.billingDetailsText.getText(), "BILLING DETAILS");

        Driver.closeDriver();




    }
    @Test
    public void US08_try() {

        //The user should be able to add her/his favorite items to her/his Wishlist.
        //The user should be able to view the items added to the Wishlist.

        //Navigate to homepage "https://pearlymarket.com/"
        Driver.getDriver().get("https://pearlymarket.com/");

        pearlyHomePage.theFirstTrendingLink.click();
    }
}

