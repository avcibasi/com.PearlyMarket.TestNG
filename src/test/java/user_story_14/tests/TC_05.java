package user_story_14.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import user_story_14.pages.*;
import utilities.*;

import java.io.IOException;

public class TC_05 {
    @Test
    public void TC_05() throws IOException {
        HomePage14 homePage14 = new HomePage14();
        MyAccount14 myAccount14 = new MyAccount14();
        StoreManager14 storeManager14 = new StoreManager14();
        ChooseImage14 chooseImage14 = new ChooseImage14();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");

        homePage14.signInButton.click();
        Driver.getDriver().get(ConfigReader.getProperty("pearly_market_url"));
        assert Driver.getDriver().getTitle().contains("Pearly Market Online Shopping");
        homePage14.signInButton.click();
       // MediaUtils.takeScreenshotOfTheEntirePageAsString();
        myAccount14.userName.sendKeys("pearly_market");
        myAccount14.password.sendKeys("pm_project_pm");
      //  MediaUtils.takeScreenshotOfTheEntirePageAsString();
        myAccount14.signInButton2.click();
        homePage14.signOut.click();
        myAccount14.storeManagerButton.click();
      //  MediaUtils.takeScreenshotOfTheEntirePageAsString();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(storeManager14.productButton).perform();
      //  MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(3);
        storeManager14.addNew1.click();
      //  MediaUtils.takeScreenshotOfTheEntirePageAsString();
        WaitUtils.waitFor(3);

        Select select1 = new Select(storeManager14.productType);

       // myAccount14.storeManagerButton.click();
       // WaitUtils.waitFor(1);

        storeManager14.productBrands.isEnabled();
       // storeManager14.addNewProductsBrands.click();
        Select select = new Select(storeManager14.parentProductBrand);
        storeManager14.productBrandsName.sendKeys("image");
        storeManager14.add2.click();
        actions.moveToElement(MyAccount14.productsLink).perform();
        JSUtils.clickWithTimeoutByJS(MyAccount14.addProductLink);
        int listOfAddedProducts = Product14.listOfAddedProducts.findElements(By.xpath("//td")).size();
        System.out.println("listOfAddedProducts = " + listOfAddedProducts);
        Assert.assertTrue(listOfAddedProducts>1);
        Driver.closeDriver();


    }
}
