package user_story_3.test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import user_story_3.pages.AddressPage;
import user_story_3.pages.SignInPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {

    @Test

    public void shippingAddressIsAdded() {

        SignInPage signInPage = new SignInPage();
        AddressPage addressPage = new AddressPage();

        // Go to website https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        // Click on sign in
        signInPage.signInHome.click();
        WaitUtils.waitFor(1);
        // enter a registered username
        signInPage.username.sendKeys(ConfigReader.getProperty("us3_username"));
        WaitUtils.waitFor(1);
        // Enter registered password
        signInPage.password.sendKeys(ConfigReader.getProperty("us3_password"));
        WaitUtils.waitFor(1);
        //click on blue sign in button
        signInPage.signIn.click();
        WaitUtils.waitFor(1);
        //click on the My Account Button on Main page(very end of the page)
        addressPage.myAccount.click();
        WaitUtils.waitFor(1);
        //click on Addresses Button on My Account page
        addressPage.addressesButton.click();
        // Scroll down with Javascripexecuter
        JSUtils.scrollIntoViewJS(addressPage.scroll);
        //Click on Edit billing Address Arrow with Javascripexecuter
        JSUtils.clickWithTimeoutByJS(addressPage.billingAddress);
        //Enter first name
        addressPage.firstName.clear();
        addressPage.firstName.sendKeys(ConfigReader.getProperty("us3_firstName"));
        WaitUtils.waitFor(1);
        //Enter  last name
        addressPage.lastName.clear();
        addressPage.lastName.sendKeys(ConfigReader.getProperty("us3_lastName"));
        // Select Country
        //WebElement dropDown = addressPage.country;
        //Select select = new Select(dropDown);
        //select.deselectAll();
        //select.selectByIndex(15);
        //dropDown.click();

        //Enter  Street Address
        addressPage.streetAddress.clear();
        addressPage.streetAddress.sendKeys(ConfigReader.getProperty("us3_streetAddress"));

        //Enter  Town/City
        addressPage.townCity.clear();
        addressPage.townCity.sendKeys(ConfigReader.getProperty("us3_town"));

        //Click  State
      // WebElement stateDropDown =   addressPage.state;
      // Select select =  new Select(stateDropDown);
       //select.selectByIndex(2);
        //Enter Shipping Postcode
        addressPage.zipcode.clear();
        addressPage.zipcode.sendKeys(ConfigReader.getProperty("us3_zipcode"));

        //Enter Telephone Number
        addressPage.phone.clear();
        addressPage.phone.sendKeys(ConfigReader.getProperty("us3_phone"));

        //Verify that The registered email address  filled in automatically
        String expected =addressPage.email.getAttribute("value");
        //String actual=ConfigReader.getProperty("us3_email")
        Assert.assertEquals(expected,ConfigReader.getProperty("us3_email"));
       //Scroll down, Click to save address button
        WaitUtils.waitFor(1);
        JSUtils.scrollAllTheWayDownJS();
        WaitUtils.waitFor(1);
        JSUtils.scrollIntoViewJS(addressPage.saveAddress);
        addressPage.saveAddress.click();
        WaitUtils.waitFor(3);
        //verify that the Billing Address be added
        Assert.assertEquals(addressPage.savedAddress.getText(),ConfigReader.getProperty("us3_expected"));
        Driver.closeDriver();
    }
}






















