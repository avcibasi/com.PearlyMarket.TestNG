package user_story_5.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_5.pages.PearlyAccountPage;
import user_story_5.pages.PearlyHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class TC004 {

    @Test
    public void US05_TC004() {

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

        //Enter the current password, new password, and confirm the new password in the respective input
        //  use us_05_password1   or us_05_password
pearlyAccountPage.passwordCurrent.sendKeys(ConfigReader.getProperty("us_05_18_password"));
pearlyAccountPage.newPassword.sendKeys(ConfigReader.getProperty("us_05_18_password1"));
pearlyAccountPage.confirmPassword.sendKeys(ConfigReader.getProperty("us_05_18_password1"));
        JSUtils.clickWithTimeoutByJS(pearlyAccountPage.saveButton);
        WebElement accountDetailsChangedSuccessfully = Driver.getDriver().findElement(By.xpath("//div[contains(@class, 'woocommerce-message')]"));
        String accountDetailsChanged = accountDetailsChangedSuccessfully.getText();
        Assert.assertEquals("Account details changed successfully.",accountDetailsChanged);
        Driver.closeDriver();
    }
    }


