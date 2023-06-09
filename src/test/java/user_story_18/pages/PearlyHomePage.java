package user_story_18.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyHomePage {
    public PearlyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;
    @FindBy(id = "username")
    public WebElement userNameOrEmail;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(name = "login")
    public WebElement loginButton;
    @FindBy(xpath = "  (//i[@class='w-icon-account'])[1]")
    public WebElement accountButton;



}
