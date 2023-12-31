package user_story_12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class AccountDetailsPage12 {


    public AccountDetailsPage12(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement SignInButton;

    @FindBy(id = "username")
    public WebElement userNameOrEmail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement signIn;

    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public WebElement signOut;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//a[text( )='My Account']")
    public WebElement myAccountLink;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccountText;

    @FindBy(xpath = "//a[text()='Account details']")
    public WebElement accountDetailsLink;

    @FindBy(xpath = "//h4[text()='Account Details']")
    public WebElement getAccountDetailsText;

    @FindBy(id = "account_first_name")
    public WebElement accountFirstName;

    @FindBy(id = "account_last_name")
    public WebElement accountLastName;

    @FindBy(id = "account_display_name")
    public WebElement accountDisplayName;

    @FindBy(id = "account_email")
    public WebElement accountEmail;



    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement biographyTextArea;


    @FindBy(id ="password_current")
    public WebElement currentPassword;

    @FindBy(id = "password_1")
    public WebElement newPassword;

    @FindBy(id = "password_2")
    public WebElement comfirmPassword;


    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement saveChangesButton;


    @FindBy(xpath = "//div[@role='alert']")
    public WebElement changesSuccesfullyMessage;

    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement alertMessage;




}