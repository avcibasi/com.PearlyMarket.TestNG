package user_story_12.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class PearlyMarketHomePage12 {


        public static WebElement signInButton2;

        public PearlyMarketHomePage12(){
            PageFactory.initElements(Driver.getDriver(),this);

        }



        //Sign In button in home page

        @FindBy(xpath = "//span[text()='Sign In']")
        public WebElement signInHome;



        @FindBy(xpath = "//span[text()='Register']")
        public WebElement register;
        @FindBy(xpath = "//input[@id='reg_username']")
        public WebElement usernameBox;
        @FindBy(xpath = "//input[@id='reg_email']")
        public WebElement emailBox;
        @FindBy(xpath = "//input[@id='reg_password']")
        public WebElement passwordBox;
        @FindBy(xpath = "//input[@id='register-policy']")
        public WebElement confirmBox;
        @FindBy(xpath = "//button[text()='Sign Up']")
        public WebElement signUpButton;
        @FindBy(xpath = "//p[text()='An account is already registered with that username. Please choose another.']")
        public WebElement usernameErrorMessage;



        @FindBy(xpath = "//p[text()='An account is already registered with your email address. ']")
        public WebElement existingCredentialsErrorMessage;
        @FindBy(xpath = "//p[text()='An account is already registered with your email address. ']")
        public WebElement existingEmailErrorMessage;
        @FindBy(xpath = "(//div//small)[1]")
        public WebElement weakPswMessage;





        //USER Story 12 home page xpath's
        @FindBy(xpath = "//li[@id='menu-item-1079']")
        public WebElement myAccount;

        @FindBy(xpath = "//span[text()='Sign In']")
        public WebElement SignIn;

        @FindBy(xpath = "//input[@id='username']")
        public WebElement vendorUserName;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement vendorPassword;

        @FindBy(xpath = "//button[text()='Sign In']")
        public static WebElement signInButton;


        //Search box to search for products

        @FindBy(xpath = "(//input[@type='search'])[1]")
        public WebElement searchBox;




    }

