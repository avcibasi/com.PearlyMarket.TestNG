package user_story_14.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_14.pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class TC_02 {
    @Test
    public void TC_02() {
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
        WaitUtils.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager14.productButton).perform();
        WaitUtils.waitFor(3);
        storeManager14.addNew1.click();
        storeManager14.chooseImg.click();
        WaitUtils.waitFor(3);
        String file = System.getProperty("photo") + "//div[@class='thumbnail']";
        //chooseImage14.uploadFilesButton.click();
       // chooseImage14.selectFilesButton.sendKeys(file);
        WaitUtils.waitFor(3);

        Product14 addProductPage = new Product14();

        //addProductPage.featuredImageInput.click();
        addProductPage.mediaLibraryButton.click();
        //addProductPage.imageSubmitButton.click();
        JSUtils.clickWithTimeoutByJS(addProductPage.imageSubmitButton);

        JSUtils.clickWithTimeoutByJS(addProductPage.galleryImageInput);
        //addProductPage.mediaLibraryButton.click();
        //JSUtils.clickWithTimeoutByJS(addProductPage.image2);
        JSUtils.clickWithTimeoutByJS(addProductPage.imageGallerySubmitButton);

        chooseImage14.selectButton.click();
        JSUtils.clickWithTimeoutByJS(addProductPage.submitButton);
        Assert.assertTrue(addProductPage.publishedMessage.isDisplayed());

        Driver.closeDriver();

    }
}
