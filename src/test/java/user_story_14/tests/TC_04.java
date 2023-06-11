package user_story_14.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import user_story_14.pages.ChooseImage14;
import user_story_14.pages.HomePage14;
import user_story_14.pages.MyAccount14;
import user_story_14.pages.StoreManager14;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

public class TC_04 {
    @Test
    public void TC_04() throws IOException {
        HomePage14 homePage14 = new HomePage14();
        MyAccount14 myAccount14 = new MyAccount14();
        StoreManager14 storeManager14 = new StoreManager14();
        ChooseImage14 chooseImage14 = new ChooseImage14();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage14.signInButton.click();
        myAccount14.userName.sendKeys("pearly_market");
        myAccount14.password.sendKeys("pm_project_pm");
        myAccount14.signInButton2.click();
        homePage14.signOut.click();
        myAccount14.storeManagerButton.click();
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager14.productButton).perform();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePageAsString();
        storeManager14.addNew1.click();
        WaitUtils.waitFor(1);

        storeManager14.addNewCategory.isEnabled();
        MediaUtils.takeScreenshotOfTheEntirePageAsString();


        Driver.closeDriver();

    }
}
