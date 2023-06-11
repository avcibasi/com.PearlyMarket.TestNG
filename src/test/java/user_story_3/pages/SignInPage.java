package user_story_3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Username or Email box in to sign in

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInHome;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    //Password to sign in
    @FindBy(id = "password")
    public WebElement password;

    //Sign In Box after typing username and password
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signIn;
}
