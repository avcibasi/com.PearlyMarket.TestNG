package user_story_5.tests;

import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_5.pages.PearlyAccountPage;
import user_story_5.pages.PearlyHomePage;
import utilities.*;

public class TC003 {
    @Test
    public void US05_TC003() {

        //   1. Login to the application.
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));

        PearlyHomePage pearlyHomePage = new PearlyHomePage();
        pearlyHomePage.signInButton.click();
        pearlyHomePage.userNameOrEmail.sendKeys(ConfigReader.getProperty("us_05_18_userNameOrEmail"));
        //  use us_05_18_password1   or us_05_18_password
        pearlyHomePage.password.sendKeys(ConfigReader.getProperty("us_05_18_password"));
        pearlyHomePage.loginButton.click();
        WaitUtils.waitFor(5);
        pearlyHomePage.accountButton.click();
        PearlyAccountPage pearlyAccountPage = new PearlyAccountPage();
//2. Navigate to "My Account" > "Account Details".
        pearlyAccountPage.accountDetailsButton.click();

       // 4. Enter a new biography in the provided input field or textarea.

        ReusableMethods.sendKeysWithTimeout(pearlyAccountPage.biography,"i love you",5);
        //5. Click the "Save" button.

        JSUtils.clickWithTimeoutByJS(pearlyAccountPage.saveButton);
        WebElement accountDetailsChangedSuccessfully = Driver.getDriver().findElement(By.xpath("//div[contains(@class, 'woocommerce-message')]"));
        String accountDetailsChanged = accountDetailsChangedSuccessfully.getText();
        Assert.assertEquals("Account details changed successfully.",accountDetailsChanged);
        Driver.closeDriver();
    }
}
