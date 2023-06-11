package user_story_18.tests;

import com.github.javafaker.Faker;

import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_18.pages.PearlyAccountPage;
import user_story_18.pages.PearlyHomePage;
import user_story_18.pages.PearlyManagerPage;
import utilities.*;

import java.io.IOException;

public class TC003 {
    @Test
    public void US18_TC003() throws IOException {
        //   1. Login to the application.
        ExtentReportUtils.pass("Test starts");
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        ExtentReportUtils.passAndCaptureScreenshot("Opening URL");
        // 2. Navigate to "My Account" > "Account Details".
        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        pearlyHomePage.signInButton.click();
        ExtentReportUtils.passAndCaptureScreenshot("Navigating to Account Details");
        pearlyHomePage.userNameOrEmail.sendKeys(ConfigReader.getProperty("us_05_18_userNameOrEmail"));
        ExtentReportUtils.passAndCaptureScreenshot("Setting e-mail");
        //  use us_05_18_password1   or us_05_18_password
        pearlyHomePage.password.sendKeys(ConfigReader.getProperty("us_05_18_password"));
        ExtentReportUtils.passAndCaptureScreenshot("Setting password");
        pearlyHomePage.loginButton.click();
        ExtentReportUtils.passAndCaptureScreenshot("Signing in");
        WaitUtils.waitFor(5);
        pearlyHomePage.accountButton.click();
        ExtentReportUtils.passAndCaptureScreenshot("Account page");
        PearlyAccountPage pearlyAccountPage = new PearlyAccountPage();
        //click store manager button
        pearlyAccountPage.vendorButton.click();
        ExtentReportUtils.passAndCaptureScreenshot("Manager page");
        //click coupons button
        PearlyManagerPage pearlyManagerPage=new PearlyManagerPage();
        pearlyManagerPage.couponsButton.click();
        //click add new coupon button
        pearlyManagerPage.addNewCoupon.click();
        ExtentReportUtils.passAndCaptureScreenshot("Adding new coupon");
        // 3. Enter a unique code for the coupon.
        Faker faker=new Faker();
        WaitUtils.waitForVisibility(  pearlyManagerPage.couponCode,3);
        pearlyManagerPage.couponCode.sendKeys(faker.name().name());
        //4. Add a description for the coupon.
        pearlyManagerPage.couponDescription.sendKeys(faker.name().name());
        // 5. Select "Percentage discount" as the discount type.
        ReusableMethods.selectByIndex(pearlyManagerPage.discountType,0);
        //6. Enter the percentage discount amount as 0 or negative .
        pearlyManagerPage.couponAmount.sendKeys("0");
        ExtentReportUtils.passAndCaptureScreenshot("Filling a coupon amount as 0");
        //7. Set an expiration date for the coupon.
        pearlyManagerPage.expiryDate.sendKeys("2025-05-24");
        //8. Select the "Allow free shipping" option.
        JSUtils.clickWithTimeoutByJS(pearlyManagerPage.freeShipping);
        //9. Select the "Show on store" option.
        JSUtils.clickWithTimeoutByJS(pearlyManagerPage.showOnStore);
        //10. Click the "Save" button.
        JSUtils.clickWithTimeoutByJS(pearlyManagerPage.submitButton);
        ExtentReportUtils.passAndCaptureScreenshot("Filling coupon before creation with past date");
        //Assert coupon creation doesnt happens succesfully
        WaitUtils.waitFor(3);
        ReusableMethods.scrollDownActions();
        ExtentReportUtils.failAndCaptureScreenshot("Test fails. It is possible to create coupon with 0 amount");
        ExtentReportUtils.flush();
        Assert.assertFalse(pearlyManagerPage.couponCreationMessage.isDisplayed());
        Driver.closeDriver();


    }
}
