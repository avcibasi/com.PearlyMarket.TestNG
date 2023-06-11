package user_story_12.tests;

import org.junit.Test;
import user_story_12.pages.AccountDetailsPage12;
import user_story_12.pages.PearlyMarketHomePage12;
import user_story_12.pages.PearlyMarketMyAccountPage12;
import utilities.*;

import java.io.IOException;



public class TC_01_001 {


    private ReusableMethods ReusableMethod;

    @Test
        public void addingBillingAddress_TestCase001() throws Exception {

            PearlyMarketHomePage12 pearlyMarketHomePage = new PearlyMarketHomePage12 ();
            PearlyMarketMyAccountPage12 pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage12();
            AccountDetailsPage12 accountDetailsPage12 = new AccountDetailsPage12();

           // ExtentReportUtils.info("Starting test ...");

            Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
            assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");

            PearlyMarketHomePage12.signInButton2.click();
            MediaUtils.takeScreenshotOfTheEntirePageAsString();

            PearlyMarketMyAccountPage12.email.sendKeys("Arthurklasse01234@outlook.com");
            PearlyMarketMyAccountPage12.password.sendKeys("Testng2023");

//        6- Navigate to the "My Account" section and click
            WaitUtils.waitFor(3);
            pearlyMarketHomePage.myAccount.click();
          //  ExtentReportUtils.passAndCaptureScreenShot("Vendor clicked on My Account");

//        7- Click on the "Addresses" tab.   (pearlyMarket MyAccount Page)
            ReusableMethod.clickWithTimeOut(pearlyMarketMyAccountPage.addresses, 2);
          //  ExtentReportUtils.passAndCaptureScreenShot("Vendor clicked on Addresses");
        }

        @Test
        public void addingBillingAddress_TestCase002() throws IOException {
            PearlyMarketHomePage12 pearlyMarketHomePage = new PearlyMarketHomePage12();
            PearlyMarketMyAccountPage12 pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage12();
            AccountDetailsPage12 accountDetailsPage12 = new AccountDetailsPage12();
            //        8- Locate the "Billing Address" section.
            ReusableMethod.verifyElementDisplayed(pearlyMarketMyAccountPage.billingAddress);
          //  ExtentReportUtils.pass("Vendor located on Billing Address");

//        9- Click on the "Add " button.
            ReusableMethod.clickWithTimeOut(pearlyMarketMyAccountPage.add, 2);
           // ExtentReportUtils.passAndCaptureScreenShot("Vendor clicked on add button");

//        10- Fill in the required fields with valid data for the new billing address:
            //Enter First Name
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.firstName, ConfigReader.getProperty("billing_address_firstname"), 2);
           // ExtentReportUtils.pass("Vendor entered firstname");

            //Enter Last Name
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.lastName, ConfigReader.getProperty("billing_address_lastname"), 2);
           // ExtentReportUtils.pass("Vendor entered lastname");

            //Enter Country/Region
            ReusableMethod.clickWithTimeOut(pearlyMarketMyAccountPage.countryRegionField, 3);
            ReusableMethod.selectDropdownByValue(pearlyMarketMyAccountPage.Canada, "Switzerland");
            pearlyMarketMyAccountPage.Canada.click();
           // ExtentReportUtils.pass("Vendor dropped down till Canada and clicked");

            //Enter Street Address
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.streetAddress, ConfigReader.getProperty("billing_street/address"), 5);
          //  ExtentReportUtils.pass("Vendor entered street Address");

            //Enter Town/City
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.townCity, ConfigReader.getProperty("billing_town/city"), 5);
           // ExtentReportUtils.pass("Vendor entered Town/City");

            //Enter Province
            ReusableMethod.clickWithTimeOut(pearlyMarketMyAccountPage.province, 3);
            ReusableMethod.selectDropdownByValue(pearlyMarketMyAccountPage.province, "Zurich");
            pearlyMarketMyAccountPage.Alberta.click();
          //  ExtentReportUtils.pass("Vendor dropped down till Alberta and clicked");

            //Enter State-Zip Code
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.postalCode, ConfigReader.getProperty("88990"), 5);
         //   ExtentReportUtils.pass("Vendor entered Postal Code");

            //Enter Phone Number
            ReusableMethod.sendKeysWithTimeout(pearlyMarketMyAccountPage.phone, ConfigReader.getProperty("033332222333344"), 5);
          //  ExtentReportUtils.pass("Vendor entered phone");


        }

        @Test
        public void addingBillingAddress_TestCase003() throws IOException {
            PearlyMarketHomePage12 pearlyMarketHomePage = new PearlyMarketHomePage12();
            PearlyMarketMyAccountPage12 pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage12();

            //Verify the registered email address filled in automatically.
            ReusableMethod.verifyElementDisplayed(pearlyMarketMyAccountPage.confirmedEmail);
           // ExtentReportUtils.passAndCaptureScreenShot("Vendor's registered email displayed");

          //  ExtentReportUtils.flush();

//       11- Click on the "Save Address" button.
            ReusableMethod.clickWithTimeOut(pearlyMarketMyAccountPage.saveAddressButton,2);
          //  ExtentReportUtils.passAndCaptureScreenShot("Vendor Billing address is saved");
        }

        @Test
        public void addingBillingAddress_TestCase004() throws IOException {
            PearlyMarketHomePage12 pearlyMarketHomePage = new PearlyMarketHomePage12();
            PearlyMarketMyAccountPage12 pearlyMarketMyAccountPage = new PearlyMarketMyAccountPage12();
            AccountDetailsPage12 accountDetailsPage12 = new AccountDetailsPage12();
//       12- Verify that the new billing address is successfully added and displayed in the "Billing Address" section.
            ReusableMethods.verifyElementDisplayed(pearlyMarketMyAccountPage.address_added);
          //  ExtentReportUtils.passAndCaptureScreenShot("Displayed Billing address saved successfully");

            Driver.closeDriver();
        }
    }


