package user_story_4.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import user_story_4.pages.MyAccountPage;
import user_story_4.pages.PearlyMarketHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class AddShippingAddress {
    @Test
    public void AddShippingAddresses(){

        PearlyMarketHomePage pearlyMarketHomePagePage = new PearlyMarketHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();


        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        WaitUtils.waitForVisibility(PearlyMarketHomePage.myaccount,5);
        JSUtils.clickWithTimeoutByJS(PearlyMarketHomePage.myaccount);
        myAccountPage.username.sendKeys("francomen");
        myAccountPage.password.sendKeys("abcde55+-*/");
        myAccountPage.signin.click();
        myAccountPage.addresses.click();
        myAccountPage.shipping.click();


        myAccountPage.firstname.sendKeys("Emre");
        myAccountPage.lastname.sendKeys("Kaya");

        myAccountPage.country.click();
        WaitUtils.waitFor(1);
        myAccountPage.searchCountry.sendKeys("Turkey");
        myAccountPage.turkey.sendKeys(Keys.ENTER);

        myAccountPage.street.sendKeys("Dere");
        myAccountPage.zip.sendKeys("16000");
        myAccountPage.city.sendKeys("Nilufer");

        WaitUtils.waitForVisibility(myAccountPage.province,3);
        JSUtils.clickWithTimeoutByJS(myAccountPage.province);
        WaitUtils.waitFor(1);
        myAccountPage.province.click();
        myAccountPage.searchProvince.sendKeys("Bursa");
        myAccountPage.bursa.sendKeys(Keys.ENTER);
        myAccountPage.save.click();

        Driver.closeDriver();
    }
}
