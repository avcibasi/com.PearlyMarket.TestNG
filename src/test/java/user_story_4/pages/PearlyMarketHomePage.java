package user_story_4.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketHomePage {
    public PearlyMarketHomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "My Account")
    public static WebElement myaccount;
}
