package user_story_11.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;
import user_story_11.pages.PearlyMarketLoginRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VendorLogin {
    PearlyMarketLoginRegisterPage pearlyMarketLoginRegisterPage=new PearlyMarketLoginRegisterPage();

    @Test
    public void vendorLoginTest(){
//    Go to website https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
//    Click on Sign In link
        pearlyMarketLoginRegisterPage.signInLink.click();
//    Enter username
        pearlyMarketLoginRegisterPage.username.sendKeys("gizem_1206@hotmail.com");
//    Enter password
        pearlyMarketLoginRegisterPage.userPassword.sendKeys(ConfigReader.getProperty("vendor_password"));
//    Click on Sign In button
        pearlyMarketLoginRegisterPage.signInButton.click();
        WaitUtils.waitFor(3);
//    Assert that you signed in
        String icon=WaitUtils.waitForVisibility(By.xpath("(//*[@id='header']//span)[8]"),3).getText();
        //String icon=Driver.getDriver().findElement(By.xpath("(//*[@id='header']//span)[8]")).getText();
        assertEquals("Sign Out",icon);
        Driver.closeDriver();
    }

    @Test
    public void loginWithIncorrectPassword(){
//    Go to website https://pearlymarket.com/
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
//    Click on Sign In link
        pearlyMarketLoginRegisterPage.signInLink.click();
//    Enter username
        pearlyMarketLoginRegisterPage.username.sendKeys("gizem_1206@hotmail.com");
//    Enter incorrect password
        pearlyMarketLoginRegisterPage.userPassword.sendKeys("gizem12345");
//    Click on Sign In button
        pearlyMarketLoginRegisterPage.signInButton.click();
        WaitUtils.waitFor(3);
//    Assert that you are not able to sign in
        String errorMessage=Driver.getDriver().findElement(By.xpath("//*[@id='signin']//form//p[3]")).getText();
        assertEquals("Wrong username or password.",errorMessage);

        Driver.closeDriver();
    }

}
