package user_story_1.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegisterPage {



    public RegisterPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        /**
         * Register Butonu
         */

        @FindBy(xpath = "//*[text()='Register']")
        public static WebElement register;


        /**
         * Username Box
         */

        @FindBy(xpath = "(//input[@id='reg_username'])[1]")
        public WebElement username;


        /**
         * Email Box
         */

        @FindBy(xpath = "(//input[@id='reg_email'])[1]")
        public WebElement email;


        /**
         * Password Box
         */

        @FindBy(xpath = "(//input[@id='reg_password'])[1]")
        public WebElement password;


        /**
         * I agree to the privacy policy
         */

        @FindBy(xpath = "(//input[@id='register-policy'])[1]")
        public static WebElement agreeBox;


        /**
         * Sign Up Butonu
         */

        @FindBy(xpath = "(//button[@value='Sign Up'])[1]")
        public static WebElement signUp;


        //Customer Login
        @FindBy(id = "customer_login")
        public WebElement customerLogin;


        /**
         * AnnAccount yazisi
         */
        @FindBy(xpath = "(//p[@class='submit-status'])[2]")
        public WebElement annAccount;


        /**
         * myAccount yazisi
         */
        @FindBy(xpath = "(//li)[2]")
        public WebElement myAccount;

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInHome;
    @FindBy(xpath = "//i[@class='w-icon-hamburger']")
    public WebElement MyAccount;



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


    }




