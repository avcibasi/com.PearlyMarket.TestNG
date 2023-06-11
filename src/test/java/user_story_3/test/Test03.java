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
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {

    @Test

    public void shippingAddressIsAdded() throws InterruptedException, IOException {

        SignInPage signInPage = new SignInPage();
        AddressPage addressPage = new AddressPage();

        // Go to website https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        // Click on sign in
        signInPage.signInHome.click();
        Thread.sleep(500);
        // enter a registered username
        signInPage.usernameOrEmail.sendKeys("merlin");
        Thread.sleep(500);
        // Enter registered password
        signInPage.password.sendKeys("rpqxm6B@123");
        Thread.sleep(500);
        //click on blue sign in button
        signInPage.signIn.click();
        Thread.sleep(500);
        //click on the My Account Button on Main page(very end of the page)
        addressPage.myAccount.click();
        Thread.sleep(500);
        //click on Addresses Button on My Acount page
        addressPage.addressesButton.click();
        // Scroll down with Javascripexecuter
        JSUtils.scrollIntoViewJS(addressPage.scroll);
        //Click on Edit billing Address Arrow with Javascripexecuter
        JSUtils.clickWithTimeoutByJS(addressPage.billingAddress);
        //Enter first name
        addressPage.firstName.clear();
        addressPage.firstName.sendKeys("Baris");
        Thread.sleep(500);
        //Enter  last name
        addressPage.lastName.clear();
        addressPage.lastName.sendKeys("Manco");
        // Select Country
        //WebElement dropDown = addressPage.country;
        //Select select = new Select(dropDown);
        //select.deselectAll();
        //select.selectByIndex(15);
        //dropDown.click();
        //Click Shipping Country/Region

        //Enter  Street Address
        addressPage.streetAddress.clear();
        addressPage.streetAddress.sendKeys("7 den 70 e");

        //Enter  Town/City
        addressPage.townCity.clear();
        addressPage.townCity.sendKeys("Moda");

        //Click  State
      // WebElement stateDropDown =   addressPage.state;
      // Select select =  new Select(stateDropDown);
       //select.selectByIndex(2);
        //Enter Shipping Postcode
        addressPage.shippingPostcode.clear();
        addressPage.shippingPostcode.sendKeys("81300");

        //Enter Telephone Number
        addressPage.phone.clear();
        addressPage.phone.sendKeys("0212212212");

        //Verify that The registered email address  filled in automatically
        String expected =addressPage.email.getAttribute("value");
        String actual = "merlin.syd@fullangle.org";
        Assert.assertEquals(expected,actual);
       //Scroll down, Click to save address button
        Thread.sleep(1000);
        JSUtils.scrollAllTheWayDownJS();
        Thread.sleep(1000);
        JSUtils.scrollIntoViewJS(addressPage.saveAddress);
        addressPage.saveAddress.click();
        Thread.sleep(1500);
        //verify that the Billing Address be added
        Assert.assertEquals(addressPage.savedAddress.getText(),"The following addresses will be used on the checkout page by default.");

    }
}






















