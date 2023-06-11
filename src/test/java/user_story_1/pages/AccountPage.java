package user_story_1.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AccountPage {

        public AccountPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(linkText = "Account details")
        public WebElement accountDetailsButton;
        @FindBy(id = "account_first_name")
        public WebElement firstName;
        @FindBy(id = "account_last_name")
        public WebElement lastName;
        @FindBy(id = "account_display_name")
        public WebElement displayName;
        @FindBy(id = "account_email")
        public WebElement email;
        @FindBy(id = "user_description")
        public WebElement biography;
        @FindBy(id = "password_current")
        public WebElement passwordCurrent;
        @FindBy(id = "password_1")
        public WebElement newPassword;
        @FindBy(id = "password_2")
        public WebElement confirmPassword;
        @FindBy(xpath = "//button[@name='save_account_details']")
        public WebElement saveButton;

        @FindBy(xpath = "(//*[@name='username'])[1]")
        public WebElement userName;
        @FindBy(xpath = "(//*[@name='password'])[1]")
        public WebElement password;
        @FindBy(xpath = "//*[@name='login']")
        public WebElement signInButton2;


    }

